package it.marco.lastminute.factory;

import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.dto.*;
import it.marco.lastminute.loader.CSVDataLoader;
import it.marco.lastminute.loader.ChocolateLoader;
import it.marco.lastminute.loader.HeadachePillsLoader;
import it.marco.lastminute.loader.PerfumeLoader;

import java.util.ArrayList;
import java.util.List;

public class ThirdShoppingBagFactory implements FactoryInterface {

	public List<ExemptedItem> createExemptedItems() {

		List<ExemptedItem> exemptedItemList = new ArrayList<ExemptedItem>();

		CSVDataLoader loader = new ChocolateLoader();
		List<Chocolate> chocolateList = loader.loadData(Constants.CSV_NAME_CHOCOLATE);

		loader = new HeadachePillsLoader();
		List<HeadachePills> headachePillsList = loader.loadData(Constants.CSV_NAME_HEADACHE_PILLS);

		exemptedItemList.add(chocolateList.get(2));
		exemptedItemList.add(headachePillsList.get(0));

		return exemptedItemList;
	}

	public List<TaxableItem> createTaxableItems() {

		List<TaxableItem> taxableItemList = new ArrayList<TaxableItem>();

		CSVDataLoader loader = new PerfumeLoader();
		List<Perfume> perfumeList = loader.loadData(Constants.CSV_NAME_PERFUME);

		taxableItemList.add(perfumeList.get(1));
		taxableItemList.add(perfumeList.get(2));

		return taxableItemList;
	}
}
