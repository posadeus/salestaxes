package it.marco.lastminute.controller;

import it.marco.lastminute.dto.TaxableItem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxController {

	public static void addTax(int taxes, TaxableItem taxableItem) {

		if (taxes != 0 && taxableItem != null) {

			BigDecimal bdTaxes = taxableItem.getFinalPrice().multiply(BigDecimal.valueOf(taxes)).divide(BigDecimal.valueOf(100));

			taxableItem.setFinalPrice(taxableItem.getFinalPrice().add(bdTaxes));
			taxableItem.setFinalPrice(taxableItem.getFinalPrice().setScale(2, RoundingMode.UP));
		}
	}
}
