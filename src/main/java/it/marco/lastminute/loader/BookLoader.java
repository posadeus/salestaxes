package it.marco.lastminute.loader;

import it.marco.lastminute.converter.BookConverter;
import it.marco.lastminute.parser.BookDaoParser;

public class BookLoader extends CSVDataLoader<BookDaoParser> {

	/*
	 * VARIABLES
	 */

	private BookDaoParser parser;
	private BookConverter converter;

	/*
	 * CONSTRUCTORS
	 */

	public BookLoader() {

		super();
		super.setParser(new BookDaoParser());
		super.setConverter(new BookConverter());
	}
}
