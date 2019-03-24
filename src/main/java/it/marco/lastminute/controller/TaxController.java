package it.marco.lastminute.controller;

import it.marco.lastminute.dto.Item;
import it.marco.lastminute.dto.Tax;
import it.marco.lastminute.dto.TaxableItem;
import it.marco.lastminute.loader.CSVDataLoader;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class TaxController {

	/**
	 * This method add a Tax to the TaxableItem's final price
	 *
	 * @param taxableItem	TaxableItem to correct with tax
	 */
	public static void addTax(TaxableItem taxableItem) {

		Tax tax = getTaxType(getTaxFromResources(), taxableItem);

		if (tax != null) {

			addTaxToItem(tax.getBaseTax(), taxableItem);
		}

	}

	/**
	 * This method add a Tax to the Item's final price
	 *
	 * @param item			TaxableItem to correct with tax
	 */
	public static void addImportTax(Item item) {

		Tax tax = getTaxType(getTaxFromResources(), item);

		if (tax != null) {

			addTaxToItem(tax.getImportTax(), item);
		}
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


	private static List<Tax> getTaxFromResources() {

		CSVDataLoader loader = new CSVDataLoader();

		return loader.loadTaxes();
	}


	private static Tax getTaxType(List<Tax> taxList, Item item) {

		Tax tax = null;

		if (item != null && taxList != null && ! taxList.isEmpty()) {

			String itemName = item.getClass().getSimpleName().toLowerCase();

			try {

				tax = taxList.stream()
						.filter(x -> itemName.equals(x.getItem()))
						.findFirst().get();
			}
			catch(NullPointerException e) {

				tax = null;
			}
		}

		return tax;
	}
}
