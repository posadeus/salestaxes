package it.marco.lastminute.controller;

import it.marco.lastminute.dto.Item;
import it.marco.lastminute.dto.TaxableItem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxController {

	/**
	 * This method add a Tax to the TaxableItem's final price
	 *
	 * @param taxes			tax to add
	 * @param taxableItem	TaxableItem to correct with tax
	 */
	public static void addTax(int taxes, TaxableItem taxableItem) {

		addTaxToItem(taxes, taxableItem);
	}

	/**
	 * This method add a Tax to the Item's final price
	 *
	 * @param taxes			tax to add
	 * @param item			TaxableItem to correct with tax
	 */
	public static void addImportTax(int taxes, Item item) {

		addTaxToItem(taxes, item);
	}

	/**
	 * This method round a tax value to the nearest upper 0.05 value
	 *
	 * @param tax	tax to round
	 *
	 * @return		rounded tax
	 */
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

	/**
	 * This method add a Tax to the Item's final price
	 *
	 * @param taxes			tax to add
	 * @param item			TaxableItem to correct with tax
	 */
	private static void addTaxToItem(int taxes, Item item) {

		if (taxes != 0 && item != null) {

			BigDecimal bdTaxes = item.getAmount().multiply(BigDecimal.valueOf(taxes)).divide(BigDecimal.valueOf(100));

			bdTaxes = roundingTax(bdTaxes);

			item.setFinalPrice(item.getFinalPrice().add(bdTaxes));
		}
	}
}
