package it.marco.lastminute.parser;

import it.marco.lastminute.dao.BookDao;

import java.math.BigDecimal;

public class BookDaoParser implements DataParserInterface<BookDao> {

	/*
	 * CONSTRUCTORS
	 */

	public BookDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	public BookDao parse(String[] line) {

		BookDao dao = new BookDao();

		try {

			dao.setAmount(new BigDecimal(line[0]));
		}
		catch (NumberFormatException e) {

			dao.setAmount(null);
		}

		dao.setImported(Boolean.valueOf(line[1]));

		return dao;
	}
}
