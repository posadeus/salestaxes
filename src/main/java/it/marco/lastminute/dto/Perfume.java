package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class Perfume extends TaxableItem {

	/*
	 * CONSTRUCTORS
	 */

	public Perfume(BigDecimal amount, Boolean isImported) {

		super(amount, isImported);
	}

	/*
	 * METHODS
	 */

	@Override
	public String toString() {

		return "Book{" +
				"amount=" + amount +
				", finalPrice=" + finalPrice +
				", isTaxable=" + isTaxable +
				", isImported=" + isImported +
				'}';
	}
}
