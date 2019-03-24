package it.marco.lastminute.loader;

import it.marco.lastminute.dto.Tax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
					tax.baseTax = Integer.valueOf(values[0]);
					tax.importTax = Integer.valueOf(values[1]);

					results.add(tax);
				}
			}
		}
		catch (IOException e) {

			e.printStackTrace();
		}
		catch (NumberFormatException e) {

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
