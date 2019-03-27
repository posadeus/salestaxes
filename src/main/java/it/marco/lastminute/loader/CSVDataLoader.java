package it.marco.lastminute.loader;

import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.converter.ConverterInterface;
import it.marco.lastminute.parser.DataParserInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public abstract class CSVDataLoader<T extends DataParserInterface<?>> implements DataLoaderInterface<T> {

	/*
	 * VARIABLES
	 */

	private T parser;
	private ConverterInterface converter;

	/*
	 * CONSTRUCTORS
	 */

	public CSVDataLoader() {}

	/*
	 * METHODS
	 */

	public T getParser() {

		return parser;
	}

	public void setParser(T parser) {

		this.parser = parser;
	}

	public ConverterInterface getConverter() {

		return converter;
	}

	public void setConverter(ConverterInterface converter) {

		this.converter = converter;
	}

	/**
	 * @see DataLoaderInterface
	 */
	public List loadData(String fileName) {

		List results = null;
		List daoList = null;

		ClassLoader classLoader = CSVDataLoader.class.getClassLoader();

		BufferedReader br = new BufferedReader(new InputStreamReader(classLoader.getResourceAsStream(fileName)));

		String line;

		try {

			// Skip header row
			if ((line = br.readLine()) != null) {

				while ((line = br.readLine()) != null) {

					String[] values = line.split(Constants.CSV_COMMA_DELIMITER);

					if (daoList == null) {

						daoList = new ArrayList();
					}

					// Parse row
					daoList.add(this.parser.parse(values));
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

		results = this.converter.convertList(daoList);

		return results;
	}
}
