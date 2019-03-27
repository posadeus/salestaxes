package it.marco.lastminute.parser;

import it.marco.lastminute.dao.HeadachePillsDao;

public class HeadachePillsDaoParser extends ItemDaoParser<HeadachePillsDao> {

	/*
	 * VARIABLES
	 */

	private HeadachePillsDao dao;

	/*
	 * CONSTRUCTORS
	 */

	public HeadachePillsDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	@Override
	protected HeadachePillsDao setNewDao() {

		return new HeadachePillsDao();
	}
}
