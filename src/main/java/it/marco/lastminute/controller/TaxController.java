package it.marco.lastminute.controller;

import it.marco.lastminute.dto.Item;
import it.marco.lastminute.dto.TaxableItem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxController {

	public static void addTax(int taxes, TaxableItem taxableItem) {

		if (taxes != 0 && taxableItem != null) {

			BigDecimal bdTaxes = taxableItem.getAmount().multiply(BigDecimal.valueOf(taxes)).divide(BigDecimal.valueOf(100));

			bdTaxes = roundingTax(bdTaxes);

			taxableItem.setFinalPrice(taxableItem.getFinalPrice().add(bdTaxes));
			//taxableItem.setFinalPrice(taxableItem.getFinalPrice().setScale(2, RoundingMode.UP));
		}
	}

	public static void addImportTax(int taxes, Item item) {

		if (taxes != 0 && item != null) {

			BigDecimal bdTaxes = item.getAmount().multiply(BigDecimal.valueOf(taxes)).divide(BigDecimal.valueOf(100));

			bdTaxes = roundingTax(bdTaxes);

			item.setFinalPrice(item.getFinalPrice().add(bdTaxes));
		}
	}

	private static BigDecimal roundingTax(BigDecimal tax) {

		if (tax != null && ! BigDecimal.ZERO.equals(tax)) {

			double taxDouble = tax.doubleValue();

			if (taxDouble % 5 != 0) {

				taxDouble = 0.05d * Math.ceil(taxDouble / 0.05d);

				tax = BigDecimal.valueOf(taxDouble).setScale(2, RoundingMode.DOWN);
			}
		}

		return tax;
	}
}
