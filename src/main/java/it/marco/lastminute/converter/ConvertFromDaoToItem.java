package it.marco.lastminute.converter;

import it.marco.lastminute.dao.BookDao;
import it.marco.lastminute.dto.Book;

public class ConvertFromDaoToItem {

	public static Book convertBookDaoInBook(BookDao dao) {

		Book book = null;

		if (dao != null) {

			book = new Book(dao.getAmount(), dao.getImported());
		}

		return book;
	}
}
