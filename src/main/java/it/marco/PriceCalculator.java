package it.marco;

public class PriceCalculator
{
  public double priceOf(Item item)
  {
    if (item.isImported())
    {

      if (item.isTaxable())
      {
        return 115.5;
      }
    }

    if ("A_TAXABLE_ITEM".equals(item.getItemType()))
    {
      return 110;
    }

    return 100;
  }
}
