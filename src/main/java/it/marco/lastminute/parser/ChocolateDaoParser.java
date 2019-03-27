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
		super.setDao(new ChocolateDao());
	}
}
