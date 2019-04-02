package it.marco.lastminute.loader;

import it.marco.lastminute.converter.ItemConverter;
import it.marco.lastminute.parser.ItemDaoParser;

public class ItemLoader extends CSVDataLoader<ItemDaoParser> {

	/*
	 * VARIABLES
	 */

	private ItemDaoParser parser;
	private ItemConverter converter;

	/*
	 * CONSTRUCTORS
	 */

	public ItemLoader() {

		super();
		super.setParser(new ItemDaoParser());
		super.setConverter(new ItemConverter());
	}
}
