package it.marco.lastminute.converter;

import it.marco.lastminute.dao.BookDao;
import it.marco.lastminute.dao.DaoInterface;
import it.marco.lastminute.dto.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookConverter implements ConverterFromDaoToItemInterface<Book> {

	public List<Book> convertList(List<DaoInterface> daoList) {

		List<Book> results = new ArrayList<Book>();

		if (daoList != null && ! daoList.isEmpty()) {

			BookConverter converter = new BookConverter();

			results = daoList.stream()
					.map(converter::convert)
					.collect(Collectors.toList());
		}

		return results;
	}

	public Book convert(DaoInterface dao) {

		Book book = null;

		if (dao != null && dao instanceof BookDao) {

			BookDao bookDao = (BookDao) dao;

			book = new Book(bookDao.getAmount(), bookDao.getImported());
		}

		return book;
	}
}
