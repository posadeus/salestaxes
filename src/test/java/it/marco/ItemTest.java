package it.marco;

import org.junit.*;

import static org.hamcrest.Matchers.is;

public class ItemTest
{
  private PriceCalculator priceCalculator;

  @Before
  public void setUp() throws Exception
  {
    priceCalculator = new PriceCalculator();
  }

  @Test
  public void taxableGoodTest()
  {
    Assert.assertThat(priceCalculator.priceOf(new Item("A_TAXABLE_ITEM", 100)), is(110));
  }
}