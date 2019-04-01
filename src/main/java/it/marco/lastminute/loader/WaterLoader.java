package it.marco.lastminute.loader;

import it.marco.lastminute.converter.WaterConverter;
import it.marco.lastminute.parser.WaterDaoParser;

public class WaterLoader extends CSVDataLoader<WaterDaoParser> {

	/*
	 * VARIABLES
	 */

	private WaterDaoParser parser;
	private WaterConverter converter;

	/*
	 * CONSTRUCTORS
	 */

	public WaterLoader() {

		super();
		super.setParser(new WaterDaoParser());
		super.setConverter(new WaterConverter());
	}
}
