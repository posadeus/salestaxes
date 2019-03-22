package it.marco.lastminute.controller;

import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.dto.Item;
import it.marco.lastminute.dto.TaxableItem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxController {

	public static void addTax(int taxes, TaxableItem taxableItem) {

		if (taxes != 0 && taxableItem != null) {

			BigDecimal bdTaxes = taxableItem.getAmount().multiply(BigDecimal.valueOf(taxes)).divide(BigDecimal.valueOf(100));

			taxableItem.setFinalPrice(taxableItem.getFinalPrice().add(bdTaxes));
			taxableItem.setFinalPrice(taxableItem.getFinalPrice().setScale(2, RoundingMode.UP));
		}
	}

	public static void addImportTax(int taxes, Item item) {

		if (taxes != 0 && item != null) {

			BigDecimal bdTaxes = item.getAmount().multiply(BigDecimal.valueOf(taxes)).divide(BigDecimal.valueOf(100));

			item.setFinalPrice(item.getFinalPrice().add(bdTaxes));
			item.setFinalPrice(item.getFinalPrice()
					.setScale(2, RoundingMode.UP)
					.multiply(new BigDecimal(Constants.ROUNDING_VALUE))	// 20 = 1 / 0.05
					.add(new BigDecimal(Constants.MARGIN_FOR_ROUNDING))	// margin to elevate number value
					.setScale(0, RoundingMode.FLOOR)
					.divide(new BigDecimal(Constants.ROUNDING_VALUE))
					.setScale(2, RoundingMode.FLOOR));
		}
	}
}
