package it.marco;

public class PriceCalculator
{
  public int priceOf(Item item)
  {
    if ("A_TAXABLE_ITEM".equals(item.getItemType()))
    {
      return 110;
    }
    return 100;
  }
}
