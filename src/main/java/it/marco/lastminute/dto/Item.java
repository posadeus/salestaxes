package it.marco.lastminute.dto;

import java.math.BigDecimal;

public abstract class Item {

	/*
	 * VARIABLES
	 */

	protected BigDecimal amount;
	protected BigDecimal finalPrice;

	/*
	 * CONSTRUCTORS
	 */

	public Item(BigDecimal amount) {

		this.amount = amount;
		this.finalPrice = amount;
	}

	/*
	 * METHODS
	 */

	public BigDecimal getAmount() {

		return amount;
	}

	public void setAmount(BigDecimal amount) {

		this.amount = amount;
	}

	public BigDecimal getFinalPrice() {

		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {

		this.finalPrice = finalPrice;
	}
}
