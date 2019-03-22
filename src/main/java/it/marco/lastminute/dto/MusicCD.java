package it.marco.lastminute.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MusicCD {

	/*
	 * VARIABLES
	 */

	public double amount;
	public double finalPrice;

	/*
	 * CONSTRUCTORS
	 */

	public MusicCD(double amount) {

		this.amount = amount;
		this.finalPrice = amount;
	}

	/*
	 * METHODS
	 */

	public void addTax(int taxes) {

		BigDecimal bdTaxes = new BigDecimal(this.finalPrice * taxes / 100);
		BigDecimal bdFinalPrice = new BigDecimal(this.finalPrice);

		bdFinalPrice = bdFinalPrice.add(bdTaxes);
		bdFinalPrice = bdFinalPrice.setScale(2, RoundingMode.UP);

		this.finalPrice = bdFinalPrice.doubleValue();
	}
}
