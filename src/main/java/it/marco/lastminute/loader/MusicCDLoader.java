package it.marco.lastminute.loader;

import it.marco.lastminute.converter.MusicCDConverter;
import it.marco.lastminute.parser.MusicCDDaoParser;

public class MusicCDLoader extends CSVDataLoader<MusicCDDaoParser> {

	/*
	 * VARIABLES
	 */

	private MusicCDDaoParser parser;
	private MusicCDConverter converter;

	/*
	 * CONSTRUCTORS
	 */

	public MusicCDLoader() {

		super();
		super.setParser(new MusicCDDaoParser());
		super.setConverter(new MusicCDConverter());
	}
}
