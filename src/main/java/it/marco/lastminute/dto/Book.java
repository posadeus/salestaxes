package it.marco.lastminute.dto;

public class Book {

	/*
	 * VARIABLES
	 */

	public double amount;
	public double finalPrice;

	/*
	 * CONSTRUCTORS
	 */

	public Book(double amount) {

		this.amount = amount;
		this.finalPrice = amount;
	}
}
