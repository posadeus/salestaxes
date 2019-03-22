package it.marco.lastminute.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MusicCD {

	/*
	 * VARIABLES
	 */

	public BigDecimal amount;
	public BigDecimal finalPrice;

	/*
	 * CONSTRUCTORS
	 */

	public MusicCD(BigDecimal amount) {

		this.amount = amount;
		this.finalPrice = amount;
	}

	/*
	 * METHODS
	 */

	public void addTax(int taxes) {

		BigDecimal bdTaxes = this.finalPrice.multiply(BigDecimal.valueOf(taxes)).divide(BigDecimal.valueOf(100));

		this.finalPrice = this.finalPrice.add(bdTaxes);
		this.finalPrice = this.finalPrice.setScale(2, RoundingMode.UP);
	}
}
