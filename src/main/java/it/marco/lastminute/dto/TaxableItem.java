package it.marco.lastminute.dto;

import java.math.BigDecimal;

public abstract class TaxableItem extends Item {

	/*
	 * VARIABLES
	 */

	protected static final Boolean isTaxable = Boolean.TRUE;

	/*
	 * CONSTRUCTORS
	 */

	public TaxableItem(BigDecimal amount) {

		super(amount, isTaxable);
	}
}
