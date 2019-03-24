package it.marco.lastminute.factory;

import it.marco.lastminute.controller.TaxController;
import it.marco.lastminute.loader.CSVDataLoader;

public class DataLoaderFactory {

	public static TaxController setCSVDataLoader() {

		TaxController taxController = new TaxController();
		taxController.setLoader(new CSVDataLoader());

		return taxController;
	}
}
