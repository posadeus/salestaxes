package it.marco.lastminute.loader;

import it.marco.lastminute.converter.PerfumeConverter;
import it.marco.lastminute.parser.PerfumeDaoParser;

public class PerfumeLoader extends CSVDataLoader<PerfumeDaoParser> {

	/*
	 * VARIABLES
	 */

	private PerfumeDaoParser parser;
	private PerfumeConverter converter;

	/*
	 * CONSTRUCTORS
	 */

	public PerfumeLoader() {

		super();
		super.setParser(new PerfumeDaoParser());
		super.setConverter(new PerfumeConverter());
	}
}
