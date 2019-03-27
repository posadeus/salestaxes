package it.marco.lastminute.dto;

import java.math.BigDecimal;

public abstract class ExemptedItem extends Item {

	/*
	 * CONSTANTS
	 */

	protected static final Boolean isTaxable = Boolean.FALSE;

	/*
	 * CONSTRUCTORS
	 */

	public ExemptedItem(BigDecimal amount, Boolean isImported) {

		super(amount, isTaxable, isImported);
	}
}
