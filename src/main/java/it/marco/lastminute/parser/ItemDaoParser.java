package it.marco.lastminute.parser;

import it.marco.lastminute.dao.ItemDao;

import java.math.BigDecimal;

public abstract class ItemDaoParser<T extends ItemDao> implements DataParserInterface<T> {

	/*
	 * VARIABLES
	 */

	protected T dao;

	/*
	 * CONSTRUCTORS
	 */

	public ItemDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	public T getDao() {

		return dao;
	}

	public void setDao(T dao) {

		this.dao = dao;
	}

	public T parse(String[] line) {

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
