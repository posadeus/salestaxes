package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class Book extends ExemptedItem {

	/*
	 * CONSTRUCTORS
	 */

	public Book(BigDecimal amount, Boolean isImported) {

		super(amount, isImported);
	}
}
