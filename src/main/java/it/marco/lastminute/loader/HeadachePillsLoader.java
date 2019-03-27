package it.marco.lastminute.loader;

import it.marco.lastminute.converter.HeadachePillsConverter;
import it.marco.lastminute.parser.HeadachePillsDaoParser;

public class HeadachePillsLoader extends CSVDataLoader<HeadachePillsDaoParser> {

	/*
	 * VARIABLES
	 */

	private HeadachePillsDaoParser parser;
	private HeadachePillsConverter converter;

	/*
	 * CONSTRUCTORS
	 */

	public HeadachePillsLoader() {

		super();
		super.setParser(new HeadachePillsDaoParser());
		super.setConverter(new HeadachePillsConverter());
	}
}
