package it.marco.lastminute.dao;

import java.math.BigDecimal;

public class MusicCDDao implements DaoInterface {

	/*
	 * VARIABLES
	 */

	private BigDecimal amount;
	private Boolean isImported;

	/*
	 * CONSTRUCTORS
	 */

	public MusicCDDao() {}

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
