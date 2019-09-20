package it.marco;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

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
    assertThat(new ReceiptCalculator(priceCalculator).totalCostFor(new Item(true,
                                                                            false,
                                                                            10),
                                                                   new Item(false,
                                                                                   false,
                                                                                   10)),
               is(21.0));
  }
}
