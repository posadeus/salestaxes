package it.marco.lastminute.dto;

import java.math.BigDecimal;

public abstract class Item {

	/*
	 * VARIABLES
	 */

	protected BigDecimal amount;
	protected BigDecimal finalPrice;
	protected Boolean isTaxable;
	protected Boolean isImported;

	/*
	 * CONSTRUCTORS
	 */

	public Item(BigDecimal amount, Boolean isTaxable, Boolean isImported) {

		this.amount = amount;
		this.finalPrice = amount;
		this.isTaxable = isTaxable;
		this.isImported = isImported;
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

	public Boolean getTaxable() {

		return isTaxable;
	}
}
