package it.marco.lastminute.dto;

import java.math.BigDecimal;

public abstract class ExemptedItem extends Item {

	/*
	 * VARIABLES
	 */

	protected static final Boolean isTaxable = Boolean.FALSE;

	/*
	 * CONSTRUCTORS
	 */

	public ExemptedItem(BigDecimal amount) {

		super(amount, isTaxable);
	}
}
