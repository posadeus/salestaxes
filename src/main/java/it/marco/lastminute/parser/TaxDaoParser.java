package it.marco.lastminute.parser;

import it.marco.lastminute.dao.TaxDao;
import it.marco.lastminute.utils.Utils;

public class TaxDaoParser implements DataParserInterface<TaxDao> {

	/*
	 * CONSTRUCTORS
	 */

	public TaxDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	/**
	 * @see DataParserInterface
	 */
	public TaxDao parse(String[] line) {

		TaxDao dao = new TaxDao();

		dao.setItem(Utils.toLowerCase(Utils.removeAllSpaces(line[0])));

		try {

			dao.setBaseTax(Integer.valueOf(line[1]));
		}
		catch (NumberFormatException e) {

			dao.setBaseTax(null);
		}

		try {

			dao.setImportTax(Integer.valueOf(line[2]));
		}
		catch (NumberFormatException e) {

			dao.setImportTax(null);
		}

		return dao;
	}
}
