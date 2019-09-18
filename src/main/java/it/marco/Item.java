package it.marco;

public class Item
{
  private boolean isImported;
  private int price;

  public Item(boolean isImported, int price)
  {
    this.isImported = isImported;
    this.price = price;
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
