package it.marco.lastminute.factory;

import it.marco.lastminute.controller.TaxController;
import it.marco.lastminute.loader.CSVDataLoader;

public class DataLoaderFactory {

	/**
	 * This method set the TaxController's loader as CSVDataLoader
	 *
	 * @return		the TaxController's loader as a new CSVDataLoader
	 */
	public static TaxController setCSVDataLoader() {

		TaxController taxController = new TaxController();
		taxController.setLoader(new CSVDataLoader());

		return taxController;
	}
}
