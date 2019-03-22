package it.marco.lastminute.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MusicCD extends Item {

	/*
	 * CONSTRUCTORS
	 */

	public MusicCD(BigDecimal amount) {

		super(amount);
	}

	/*
	 * METHODS
	 */

	public void addTax(int taxes) {

		BigDecimal bdTaxes = super.finalPrice.multiply(BigDecimal.valueOf(taxes)).divide(BigDecimal.valueOf(100));

		super.finalPrice = super.finalPrice.add(bdTaxes);
		super.finalPrice = super.finalPrice.setScale(2, RoundingMode.UP);
	}
}
