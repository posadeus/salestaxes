package it.marco;

import org.junit.*;

import static org.hamcrest.Matchers.is;

public class PriceCalculatorTest
{
  private PriceCalculator priceCalculator;

  @Before
  public void setUp() throws Exception
  {
    priceCalculator = new PriceCalculator();
  }

  @Test
  public void taxableItemTest()
  {
    Assert.assertThat(priceCalculator.priceOf(new Item(true,
                                                       false,
                                                       100)),
                      is(110.0));
  }

  @Test
  public void notTaxableItemTest()
  {
    Assert.assertThat(priceCalculator.priceOf(new Item(false,
                                                       false,
                                                       100)),
                      is(100.0));
  }

  @Test
  public void importableAndTaxableItemTest()
  {
    Assert.assertThat(priceCalculator.priceOf(new Item(true,
                                                       true,
                                                       100)),
                      is(115.0));
  }

  @Test
  public void importableAndNotTaxableItemTest()
  {
    Assert.assertThat(priceCalculator.priceOf(new Item(false,
                                                       true,
                                                       100)),
                      is(105.0));
  }
}
