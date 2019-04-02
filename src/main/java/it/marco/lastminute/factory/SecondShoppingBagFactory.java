package it.marco.lastminute.factory;

import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.dto.ExemptedItem;
import it.marco.lastminute.dto.Item;
import it.marco.lastminute.dto.TaxableItem;
import it.marco.lastminute.loader.CSVDataLoader;
import it.marco.lastminute.loader.ItemLoader;

import java.util.ArrayList;
import java.util.List;

public class SecondShoppingBagFactory implements FactoryInterface {

	public List<ExemptedItem> createExemptedItems() {

		List<ExemptedItem> exemptedItemList = new ArrayList<ExemptedItem>();

		CSVDataLoader loader = new ItemLoader();
		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		exemptedItemList.add((ExemptedItem) itemList.get(2));

		return exemptedItemList;
	}

	public List<TaxableItem> createTaxableItems() {

		List<TaxableItem> taxableItemList = new ArrayList<TaxableItem>();

		CSVDataLoader loader = new ItemLoader();
		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		taxableItemList.add((TaxableItem) itemList.get(6));

		return taxableItemList;
	}
}
