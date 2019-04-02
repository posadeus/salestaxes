package it.marco.lastminute.factory;

import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.dto.*;
import it.marco.lastminute.loader.CSVDataLoader;
import it.marco.lastminute.loader.ItemLoader;

import java.util.ArrayList;
import java.util.List;

public class FirstShoppingBagFactory implements FactoryInterface {

	public List<ExemptedItem> createExemptedItems() {

		List<ExemptedItem> exemptedItemList = new ArrayList<ExemptedItem>();

		CSVDataLoader loader = new ItemLoader();
		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		exemptedItemList.add((ExemptedItem) itemList.get(0));
		exemptedItemList.add((ExemptedItem) itemList.get(1));

		return exemptedItemList;
	}

	public List<TaxableItem> createTaxableItems() {

		List<TaxableItem> taxableItemList = new ArrayList<TaxableItem>();

		CSVDataLoader loader = new ItemLoader();
		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		taxableItemList.add((TaxableItem) itemList.get(5));

		return taxableItemList;
	}
}
