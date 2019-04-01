package it.marco.lastminute.parser;

import it.marco.lastminute.dao.WaterDao;

public class WaterDaoParser extends ItemDaoParser<WaterDao> {

	/*
	 * VARIABLES
	 */

	private WaterDao dao;

	/*
	 * CONSTRUCTORS
	 */

	public WaterDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	@Override
	protected WaterDao setNewDao() {

		return new WaterDao();
	}
}
