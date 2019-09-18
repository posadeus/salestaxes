package it.marco;

public class TaxablePriceCalculator implements PriceCalculator
{
  public double priceOf(Item item)
  {
    if (item.isImported())
    {
      return item.getPrice() + (item.getPrice() / 20) + (item.getPrice() + (item.getPrice() / 20)) / 10;
    }

    return item.getPrice() + (item.getPrice() / 10);
  }
}
