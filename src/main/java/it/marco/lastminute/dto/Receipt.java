package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class Receipt {

	/*
	 * VARIABLES
	 */

	public BigDecimal totalAmount;
	public BigDecimal totalTaxesAmount;

	/*
	 * CONSTRUCTORS
	 */

	public Receipt(Book book, MusicCD musicCD, Chocolate chocolate) {

		this.totalAmount = book.finalPrice.add(musicCD.finalPrice).add(chocolate.finalPrice);
		this.totalTaxesAmount = this.totalAmount.subtract(book.amount).subtract(musicCD.amount).subtract(chocolate.amount);
	}
}
