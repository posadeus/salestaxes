package it.marco;

public class DefaultPriceCalculator implements PriceCalculator
{
  public double priceOf(Item item)
  {
    double itemPrice = 0;

    if (item.isImported())
    {
      itemPrice = item.getPrice() + (item.getPrice() / 20);
    }
    else
    {

      itemPrice = item.getPrice();
    }

    if (item.isTaxable())
    {
      itemPrice += itemPrice / 10;
    }

    return itemPrice;
  }
}
