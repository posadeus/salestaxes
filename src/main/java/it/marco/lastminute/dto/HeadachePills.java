package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class HeadachePills extends ExemptedItem {

	/*
	 * CONSTRUCTORS
	 */

	public HeadachePills(BigDecimal amount, Boolean isImported) {

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
