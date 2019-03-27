package it.marco.lastminute.parser;

import it.marco.lastminute.dao.MusicCDDao;

public class MusicCDDaoParser extends ItemDaoParser<MusicCDDao> {

	/*
	 * VARIABLES
	 */

	private MusicCDDao dao;

	/*
	 * CONSTRUCTORS
	 */

	public MusicCDDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	@Override
	protected MusicCDDao setNewDao() {

		return new MusicCDDao();
	}
}
