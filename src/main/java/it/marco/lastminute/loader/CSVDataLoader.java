package it.marco.lastminute.loader;

import it.marco.lastminute.dto.Tax;
import it.marco.lastminute.utils.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVDataLoader implements DataLoaderInterface {

	/*
	 * CONSTRUCTORS
	 */

	public CSVDataLoader() {}

	/*
	 * METHODS
	 */

	/**
	 * @see DataLoaderInterface
	 */
	public List<Tax> loadTaxes() {

		List<Tax> results = null;

		ClassLoader classLoader = CSVDataLoader.class.getClassLoader();

		BufferedReader br = new BufferedReader(new InputStreamReader(classLoader.getResourceAsStream("taxes.csv")));

		String line;

		try {

			// Skip header row
			if ((line = br.readLine()) != null) {

				while ((line = br.readLine()) != null) {

					String[] values = line.split(",");

					if (results == null) {

						results = new ArrayList<Tax>();
					}

					// Parse row
					Tax tax = new Tax();
					tax.setItem(Utils.toLowerCase(Utils.removeAllSpaces(values[0])));

					try {

						tax.setBaseTax(Integer.valueOf(values[1]));
					}
					catch (NumberFormatException e) {

						tax.setBaseTax(null);
					}

					try {

						tax.setImportTax(Integer.valueOf(values[2]));
					}
					catch (NumberFormatException e) {

						tax.setImportTax(null);
					}

					results.add(tax);
				}
			}
		}
		catch (IOException e) {

			e.printStackTrace();
		}

		try {

			br.close();
		}
		catch (IOException e) {

			e.printStackTrace();
		}

		return results;
	}
}
