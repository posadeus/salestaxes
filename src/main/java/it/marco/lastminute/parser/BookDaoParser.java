package it.marco.lastminute.parser;

import it.marco.lastminute.dao.BookDao;

public class BookDaoParser extends ItemDaoParser<BookDao> {

	/*
	 * VARIABLES
	 */

	private BookDao dao;

	/*
	 * CONSTRUCTORS
	 */

	public BookDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	@Override
	protected BookDao setNewDao() {

		return new BookDao();
	}
}
