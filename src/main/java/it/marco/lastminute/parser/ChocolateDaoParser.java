package it.marco.lastminute.parser;

import it.marco.lastminute.dao.ChocolateDao;

public class ChocolateDaoParser extends ItemDaoParser<ChocolateDao> {

	/*
	 * VARIABLES
	 */

	private ChocolateDao dao;

	/*
	 * CONSTRUCTORS
	 */

	public ChocolateDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	@Override
	protected ChocolateDao setNewDao() {

		return new ChocolateDao();
	}
}
