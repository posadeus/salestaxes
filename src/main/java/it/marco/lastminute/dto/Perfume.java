package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class Perfume extends TaxableItem {

	/*
	 * CONSTRUCTORS
	 */

	public Perfume(BigDecimal amount, Boolean isImported) {

		super(amount, isImported);
	}
}
