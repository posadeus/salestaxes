package it.marco.lastminute.parser;

import it.marco.lastminute.dao.ItemDao;

import java.math.BigDecimal;

public class ItemDaoParser implements DataParserInterface<ItemDao> {

	/*
	 * VARIABLES
	 */

	protected ItemDao dao;

	/*
	 * CONSTRUCTORS
	 */

	public ItemDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	public ItemDao getDao() {

		return dao;
	}

	public void setDao(ItemDao dao) {

		this.dao = dao;
	}

	/**
	 * @see DataParserInterface
	 */
	public ItemDao parse(String[] line) {

		setDao(setNewDao());

		dao.setType(line[0]);

		try {

			dao.setAmount(new BigDecimal(line[1]));
		}
		catch (NumberFormatException e) {

			dao.setAmount(null);
		}

		dao.setImported(Boolean.valueOf(line[2]));
		dao.setTaxable(Boolean.valueOf(line[3]));

		return dao;
	}


	private ItemDao setNewDao() {

		return new ItemDao();
	}
}
