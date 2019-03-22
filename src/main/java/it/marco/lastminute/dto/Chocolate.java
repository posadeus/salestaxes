package it.marco.lastminute.dto;

import java.math.BigDecimal;

public class Chocolate {

	/*
	 * VARIABLES
	 */

	public BigDecimal amount;
	public BigDecimal finalPrice;

	/*
	 * CONSTRUCTORS
	 */

	public Chocolate(BigDecimal amount) {

		this.amount = amount;
		this.finalPrice = amount;
	}
}
