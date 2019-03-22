package it.marco.lastminute.dto;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Receipt {

	/*
	 * VARIABLES
	 */

	private BigDecimal totalAmount;
	private BigDecimal totalTaxesAmount;

	/*
	 * CONSTRUCTORS
	 */

	public Receipt(Item... items) {

		List<Item> itemList = Arrays.asList(items);

		this.totalAmount = itemList.stream()					// Convert list to stream
			.map(Item::getFinalPrice)							// Convert stream to BigDecimal
			.reduce(BigDecimal.ZERO, BigDecimal::add);			// Sum values from 0

		this.totalTaxesAmount = itemList.stream()				// Convert list to stream
			.map(Item::getAmount)								// Convert stream to BigDecimal
			.reduce(this.totalAmount, BigDecimal::subtract);	// Subtract values from totalAmount
	}

	/*
	 * METHODS
	 */

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
}
