package it.marco.lastminute.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Receipt {

	/*
	 * VARIABLES
	 */

	public double totalAmount;
	public double totalTaxesAmount;

	/*
	 * CONSTRUCTORS
	 */

	public Receipt(Book book, MusicCD musicCD, Chocolate chocolate) {

		this.totalAmount = book.finalPrice + musicCD.finalPrice + chocolate.finalPrice;
		this.totalTaxesAmount = this.totalAmount - book.amount - musicCD.amount - chocolate.amount;

		BigDecimal bd = new BigDecimal(this.totalTaxesAmount);
		bd = bd.setScale(2, RoundingMode.UP);
		this.totalTaxesAmount = bd.doubleValue();
	}
}
