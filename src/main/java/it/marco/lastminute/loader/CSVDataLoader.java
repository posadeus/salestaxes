package it.marco.lastminute.loader;

import it.marco.lastminute.dto.Tax;

import java.util.ArrayList;
import java.util.List;

public class CSVDataLoader {

	/*
	 * CONSTRUCTORS
	 */

	public CSVDataLoader() {}

	/*
	 * METHODS
	 */

	public List<Tax> loadTaxes() {

		Tax tax = new Tax(10, 5);

		List<Tax> taxList = new ArrayList<Tax>();
		taxList.add(tax);

		return taxList;
	}
}
