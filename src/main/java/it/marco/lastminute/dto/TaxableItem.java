package it.marco.lastminute.dto;

import it.marco.lastminute.controller.TaxController;
import it.marco.lastminute.factory.DataLoaderFactory;

import java.math.BigDecimal;

public class TaxableItem extends Item {

	/*
	 * CONSTANTS
	 */

	protected static final Boolean isTaxable = Boolean.TRUE;

	/*
	 * CONSTRUCTORS
	 */

	public TaxableItem(String type, BigDecimal amount, Boolean isImported) {

		super(type, amount, isTaxable, isImported);

		TaxController taxController = DataLoaderFactory.setCSVDataLoader();
		taxController.addTax(this);
	}
}
