package it.marco;

public class PriceCalculator
{
  public double priceOf(Item item)
  {
    if (item.isImported())
    {
      if (item.isTaxable())
      {
        return item.getPrice() + (item.getPrice() / 20) + (item.getPrice() + (item.getPrice() / 20)) / 10;
      }

      return item.getPrice() + (item.getPrice() / 20);
    }

    if (item.isTaxable())
    {
      return item.getPrice() + (item.getPrice() / 10);
    }

    return item.getPrice();
  }
}
