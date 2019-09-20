package it.marco;

import org.junit.*;

import static org.hamcrest.Matchers.is;

public class ReceiptCalculatorTest
{
  private PriceCalculator priceCalculator;

  @Before
  public void setUp() throws Exception
  {
    priceCalculator = new DefaultPriceCalculator();
  }

  @Test
  public void totalCostForTest()
  {
    Assert.assertThat(new ReceiptCalculator(priceCalculator).totalCostFor(new Item(true,
                                                                                   false,
                                                                                   10),
                                                                          new Item(false,
                                                                                   false,
                                                                                   10)),
                      is(21.0));
  }
}
