package it.marco.lastminute.dao;

import java.math.BigDecimal;

public abstract class ItemDao implements DaoInterface {

	/*
	 * VARIABLES
	 */

	protected BigDecimal amount;
	protected Boolean isImported;

	/*
	 * CONSTRUCTORS
	 */

	public ItemDao() {}

	/*
	 * METHODS
	 */

	public BigDecimal getAmount() {

		return amount;
	}

	public void setAmount(BigDecimal amount) {

		this.amount = amount;
	}

	public Boolean getImported() {

		return isImported;
	}

	public void setImported(Boolean imported) {

		isImported = imported;
	}
}
