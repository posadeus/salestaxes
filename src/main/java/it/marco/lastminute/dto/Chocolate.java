package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class Chocolate extends ExemptedItem {

	/*
	 * CONSTRUCTORS
	 */

	public Chocolate(BigDecimal amount, Boolean isImported) {

		super(amount, isImported);
	}
}
