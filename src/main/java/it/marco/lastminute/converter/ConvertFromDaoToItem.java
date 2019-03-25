package it.marco.lastminute.converter;

import it.marco.lastminute.dao.BookDao;
import it.marco.lastminute.dao.TaxDao;
import it.marco.lastminute.dto.Book;
import it.marco.lastminute.dto.Tax;

public class ConvertFromDaoToItem {

	public static Book convertBookDaoInBook(BookDao dao) {

		Book book = null;

		if (dao != null) {

			book = new Book(dao.getAmount(), dao.getImported());
		}

		return book;
	}

	public static Tax convertTaxDaoInTax(TaxDao dao) {

		Tax tax = null;

		if (dao != null) {

			tax = new Tax();
			tax.setItem(dao.getItem());
			tax.setBaseTax(dao.getBaseTax());
			tax.setImportTax(dao.getImportTax());
		}

		return tax;
	}
}
