package it.marco.lastminute.dto;

import it.marco.lastminute.controller.ShoppingBagController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Receipt {

	/*
	 * VARIABLES
	 */

	private List<Item> itemList;
	private BigDecimal totalAmount;
	private BigDecimal totalTaxesAmount;

	/*
	 * CONSTRUCTORS
	 */

	public Receipt(Item... items) {

		this.itemList = Arrays.asList(items);

		setAmounts();
	}

	public Receipt(ShoppingBagController shoppingBag) {

		if (shoppingBag != null && shoppingBag.getItemList() != null && ! shoppingBag.getItemList().isEmpty()) {

			this.itemList = shoppingBag.getItemList();

			setAmounts();
		}
	}

	/*
	 * METHODS
	 */

	public List<Item> getItemList() {

		return itemList;
	}

	public void setItemList(List<Item> itemList) {

		this.itemList = itemList;
	}

	public BigDecimal getTotalAmount() {

		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {

		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalTaxesAmount() {

		return totalTaxesAmount;
	}

	public void setTotalTaxesAmount(BigDecimal totalTaxesAmount) {

		this.totalTaxesAmount = totalTaxesAmount;
	}

	/**
	 * This method print all the Items in Receipt with their name and their final price (with taxex).
	 * It also prints the total amount of the Items and the total amount of Taxes.
	 *
	 * @return		the printed Receipt
	 */
	public String print() {

		String str = "";

		for (Item item : itemList) {

			str += item.getType();
			str += " --> ";
			str += item.getFinalPrice();
			str += "\n";
		}

		str += "\n";
		str += "Total Amount --> " + this.getTotalAmount();
		str += "\n";
		str += "Total Amount of Taxes --> " + this.getTotalTaxesAmount();

		return str;
	}


	private void setAmounts() {

		if (itemList != null && ! itemList.isEmpty()) {

			this.totalAmount = this.itemList.stream()					// Convert list to stream
					.map(Item::getFinalPrice)							// Convert stream to BigDecimal
					.reduce(BigDecimal.ZERO, BigDecimal::add);			// Sum values from 0

			this.totalTaxesAmount = this.itemList.stream()				// Convert list to stream
					.map(Item::getAmount)								// Convert stream to BigDecimal
					.reduce(this.totalAmount, BigDecimal::subtract);	// Subtract values from totalAmount
		}
	}
}
