package it.marco.lastminute.converter;

import it.marco.lastminute.dao.HeadachePillsDao;
import it.marco.lastminute.dto.HeadachePills;

public class HeadachePillsConverter extends GenericConverter<HeadachePills, HeadachePillsDao> {

	/*
	 * METHODS
	 */

	/**
	 * @see GenericConverter
	 */
	public HeadachePills convert(HeadachePillsDao dao) {

		HeadachePills headachePills = null;

		if (dao != null) {

			headachePills = new HeadachePills(dao.getAmount(), dao.getImported());
		}

		return headachePills;
	}
}
