package it.marco;

public class DefaultPriceCalculator implements PriceCalculator
{
  public double priceOf(Item item)
  {
    if (item.isImported())
    {
      return item.getPrice() + (item.getPrice() / 20);
    }

    return item.getPrice();
  }
}
