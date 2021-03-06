package it.marco.lastminute.dto;

import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.controller.TaxController;

import java.math.BigDecimal;

public abstract class TaxableItem extends Item {

	/*
	 * VARIABLES
	 */

	protected static final Boolean isTaxable = Boolean.TRUE;

	/*
	 * CONSTRUCTORS
	 */

	public TaxableItem(BigDecimal amount, Boolean isImported) {

		super(amount, isTaxable, isImported);
		TaxController.addTax(Constants.TAX_FOR_TAXABLE_ITEM, this);
	}
}
