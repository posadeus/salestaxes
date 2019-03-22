package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class MusicCD extends TaxableItem {

	/*
	 * CONSTRUCTORS
	 */

	public MusicCD(BigDecimal amount, Boolean isImported) {

		super(amount, isImported);
	}
}
