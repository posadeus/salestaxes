package it.marco.lastminute.dto;

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
	}
}
