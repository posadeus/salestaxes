package it.marco.lastminute.factory;

import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.dto.*;
import it.marco.lastminute.loader.BookLoader;
import it.marco.lastminute.loader.CSVDataLoader;
import it.marco.lastminute.loader.ChocolateLoader;
import it.marco.lastminute.loader.MusicCDLoader;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FirstShoppingBagFactory implements FactoryInterface {

	public List<ExemptedItem> createExemptedItems() {

		List<ExemptedItem> exemptedItemList = new ArrayList<ExemptedItem>();

		CSVDataLoader loader = new BookLoader();
		List<Book> bookList = loader.loadData(Constants.CSV_NAME_BOOK);

		loader = new ChocolateLoader();
		List<Chocolate> chocolateList = loader.loadData(Constants.CSV_NAME_CHOCOLATE);

		exemptedItemList.add(bookList.get(0));
		exemptedItemList.add(chocolateList.get(0));

		return exemptedItemList;
	}

	public List<TaxableItem> createTaxableItems() {

		List<TaxableItem> taxableItemList = new ArrayList<TaxableItem>();

		CSVDataLoader loader = new MusicCDLoader();
		List<MusicCD> musicCDList = loader.loadData(Constants.CSV_NAME_MUSIC_CD);

		taxableItemList.add(musicCDList.get(0));

		return taxableItemList;
	}
}
