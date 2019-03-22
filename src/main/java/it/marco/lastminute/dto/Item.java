package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class Item {

	/*
	 * VARIABLES
	 */

	public BigDecimal amount;
	public BigDecimal finalPrice;

	/*
	 * CONSTRUCTORS
	 */

	public Item(BigDecimal amount) {

		this.amount = amount;
		this.finalPrice = amount;
	}
}
