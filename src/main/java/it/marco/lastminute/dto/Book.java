package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class Book {

	/*
	 * VARIABLES
	 */

	public BigDecimal amount;
	public BigDecimal finalPrice;

	/*
	 * CONSTRUCTORS
	 */

	public Book(BigDecimal amount) {

		this.amount = amount;
		this.finalPrice = amount;
	}
}
