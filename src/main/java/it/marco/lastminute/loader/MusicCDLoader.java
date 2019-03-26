package it.marco.lastminute.loader;

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
