package it.marco.lastminute.loader;

import it.marco.lastminute.converter.ChocolateConverter;
import it.marco.lastminute.parser.ChocolateDaoParser;

public class ChocolateLoader extends CSVDataLoader<ChocolateDaoParser> {

	/*
	 * VARIABLES
	 */

	private ChocolateDaoParser parser;
	private ChocolateConverter converter;

	/*
	 * CONSTRUCTORS
	 */

	public ChocolateLoader() {

		super();
		super.setParser(new ChocolateDaoParser());
		super.setConverter(new ChocolateConverter());
	}
}
