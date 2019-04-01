package it.marco.lastminute.factory;

import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.dto.Chocolate;
import it.marco.lastminute.dto.ExemptedItem;
import it.marco.lastminute.dto.Perfume;
import it.marco.lastminute.dto.TaxableItem;
import it.marco.lastminute.loader.CSVDataLoader;
import it.marco.lastminute.loader.ChocolateLoader;
import it.marco.lastminute.loader.PerfumeLoader;

import java.util.ArrayList;
import java.util.List;

public class SecondShoppingBagFactory implements FactoryInterface {

	public List<ExemptedItem> createExemptedItems() {

		List<ExemptedItem> exemptedItemList = new ArrayList<ExemptedItem>();

		CSVDataLoader loader = new ChocolateLoader();
		List<Chocolate> chocolateList = loader.loadData(Constants.CSV_NAME_CHOCOLATE);

		exemptedItemList.add(chocolateList.get(1));

		return exemptedItemList;
	}

	public List<TaxableItem> createTaxableItems() {

		List<TaxableItem> taxableItemList = new ArrayList<TaxableItem>();

		CSVDataLoader loader = new PerfumeLoader();
		List<Perfume> perfumeList = loader.loadData(Constants.CSV_NAME_PERFUME);

		taxableItemList.add(perfumeList.get(0));

		return taxableItemList;
	}
}
