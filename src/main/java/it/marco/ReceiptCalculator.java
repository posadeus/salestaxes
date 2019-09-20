package it.marco;

public class ReceiptCalculator
{
  private PriceCalculator priceCalculator;

  public ReceiptCalculator(PriceCalculator priceCalculator)
  {
    this.priceCalculator = priceCalculator;
  }

  public double totalCostFor(Item... items)
  {
    double sum = 0;

    for (Item item : items)
    {

      sum += priceCalculator.priceOf(item);
    }

    return sum;
  }
}
