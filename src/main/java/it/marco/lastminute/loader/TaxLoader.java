package it.marco.lastminute.loader;

import it.marco.lastminute.converter.TaxConverter;
import it.marco.lastminute.parser.TaxDaoParser;

public class TaxLoader extends CSVDataLoader<TaxDaoParser> {

	/*
	 * VARIABLES
	 */

	private TaxDaoParser parser;
	private TaxConverter converter;

	/*
	 * CONSTRUCTORS
	 */

	public TaxLoader() {

		super();
		super.setParser(new TaxDaoParser());
		super.setConverter(new TaxConverter());
	}
}
