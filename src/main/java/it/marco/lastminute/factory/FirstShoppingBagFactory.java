package it.marco.lastminute.factory;

import it.marco.lastminute.dto.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FirstShoppingBagFactory implements FactoryInterface {

	public List<ExemptedItem> createExemptedItems() {

		List<ExemptedItem> exemptedItemList = new ArrayList<ExemptedItem>();

		exemptedItemList.add(new Book(BigDecimal.valueOf(12.49), Boolean.FALSE));
		exemptedItemList.add(new Chocolate(BigDecimal.valueOf(0.85), Boolean.FALSE));

		return exemptedItemList;
	}

	public List<TaxableItem> createTaxableItems() {

		List<TaxableItem> taxableItemList = new ArrayList<TaxableItem>();

		taxableItemList.add(new MusicCD(BigDecimal.valueOf(14.99), Boolean.FALSE));

		return taxableItemList;
	}
}
