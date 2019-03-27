package it.marco.lastminute.converter;

import it.marco.lastminute.dao.BookDao;
import it.marco.lastminute.dto.Book;

public class BookConverter extends GenericConverter<Book, BookDao> {

	/*
	 * METHODS
	 */

	/**
	 * @see GenericConverter
	 */
	public Book convert(BookDao dao) {

		Book book = null;

		if (dao != null) {

			book = new Book(dao.getAmount(), dao.getImported());
		}

		return book;
	}
}
