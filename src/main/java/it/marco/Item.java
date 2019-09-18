package it.marco;

public class Item
{
  private boolean isTaxable;
  private boolean isImported;
  private int price;

  public Item(boolean isTaxable, boolean isImported, int price)
  {
    this.isTaxable = isTaxable;
    this.isImported = isImported;
    this.price = price;
  }

  public boolean isTaxable()
  {
    return isTaxable;
  }

  public boolean isImported()
  {
    return isImported;
  }

  public int getPrice()
  {
    return price;
  }
}
