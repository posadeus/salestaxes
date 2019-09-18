package it.marco;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class PriceCalculatorTest
{
  private PriceCalculator priceCalculator;

  @Test
  public void taxableItemTest()
  {
    priceCalculator = new TaxablePriceCalculator();

    Assert.assertThat(priceCalculator.priceOf(new TaxableItem(false,
                                                              100)),
                      is(110.0));
  }

  @Test
  public void notTaxableItemTest()
  {
    priceCalculator = new DefaultPriceCalculator();

    Assert.assertThat(priceCalculator.priceOf(new Item(false,
                                                       100)),
                      is(100.0));
  }

  @Test
  public void importableAndTaxableItemTest()
  {
    priceCalculator = new TaxablePriceCalculator();

    Assert.assertThat(priceCalculator.priceOf(new TaxableItem(true,
                                                              100)),
                      is(115.0));
  }

  @Test
  public void importableAndNotTaxableItemTest()
  {
    priceCalculator = new DefaultPriceCalculator();

    Assert.assertThat(priceCalculator.priceOf(new Item(true,
                                                       100)),
                      is(105.0));
  }
}
