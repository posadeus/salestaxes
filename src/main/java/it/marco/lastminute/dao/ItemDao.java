package it.marco.lastminute.dao;

import java.math.BigDecimal;

public class ItemDao implements DaoInterface {

	/*
	 * VARIABLES
	 */

	private String type;
	private BigDecimal amount;
	private Boolean isTaxable;
	private Boolean isImported;

	/*
	 * CONSTRUCTORS
	 */

	public ItemDao() {}

	/*
	 * METHODS
	 */

	public String getType() {

		return type;
	}

	public void setType(String type) {

		this.type = type;
	}

	public BigDecimal getAmount() {

		return amount;
	}

	public void setAmount(BigDecimal amount) {

		this.amount = amount;
	}

	public Boolean getTaxable() {

		return isTaxable;
	}

	public void setTaxable(Boolean taxable) {

		isTaxable = taxable;
	}

	public Boolean getImported() {

		return isImported;
	}

	public void setImported(Boolean imported) {

		isImported = imported;
	}
}
