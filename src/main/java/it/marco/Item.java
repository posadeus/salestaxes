package it.marco;

public class Item
{
  private String itemType;
  private boolean isTaxable;
  private boolean isImported;
  private int price;

  public Item(String itemType, int price)
  {
    this.itemType = itemType;
    this.price = price;
  }

  public Item(boolean isTaxable, boolean isImported, int price)
  {
    this.isTaxable = isTaxable;
    this.isImported = isImported;
    this.price = price;
  }

  public String getItemType()
  {
    return itemType;
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
