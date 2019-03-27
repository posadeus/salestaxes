package it.marco.lastminute.parser;

import it.marco.lastminute.dao.PerfumeDao;

public class PerfumeDaoParser extends ItemDaoParser<PerfumeDao> {

	/*
	 * VARIABLES
	 */

	private PerfumeDao dao;

	/*
	 * CONSTRUCTORS
	 */

	public PerfumeDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	@Override
	protected PerfumeDao setNewDao() {

		return new PerfumeDao();
	}
}
