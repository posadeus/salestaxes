package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class ExemptedItem extends Item {

	/*
	 * CONSTANTS
	 */

	protected static final Boolean isTaxable = Boolean.FALSE;

	/*
	 * CONSTRUCTORS
	 */

	public ExemptedItem(String type, BigDecimal amount, Boolean isImported) {

		super(type, amount, isTaxable, isImported);
	}
}
