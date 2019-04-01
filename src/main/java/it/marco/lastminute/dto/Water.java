package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class Water extends ExemptedItem {

	/*
	 * CONSTRUCTORS
	 */

	public Water(BigDecimal amount, Boolean isImported) {

		super(amount, isImported);
	}

	/*
	 * METHODS
	 */

	@Override
	public String toString() {

		return "Water{" +
				"amount=" + amount +
				", finalPrice=" + finalPrice +
				", isTaxable=" + isTaxable +
				", isImported=" + isImported +
				'}';
	}
}
