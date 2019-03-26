package it.marco.lastminute.parser;

import it.marco.lastminute.dao.MusicCDDao;

import java.math.BigDecimal;

public class MusicCDDaoParser implements DataParserInterface<MusicCDDao> {

	/*
	 * CONSTRUCTORS
	 */

	public MusicCDDaoParser() {

		super();
	}

	/*
	 * METHODS
	 */

	public MusicCDDao parse(String[] line) {

		MusicCDDao dao = new MusicCDDao();

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
