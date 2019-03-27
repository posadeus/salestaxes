package it.marco.lastminute.converter;

import it.marco.lastminute.dao.ChocolateDao;
import it.marco.lastminute.dto.Chocolate;

public class ChocolateConverter extends GenericConverter<Chocolate, ChocolateDao> {

	/*
	 * METHODS
	 */

	/**
	 * @see GenericConverter
	 */
	public Chocolate convert(ChocolateDao dao) {

		Chocolate chocolate = null;

		if (dao != null) {

			chocolate = new Chocolate(dao.getAmount(), dao.getImported());
		}

		return chocolate;
	}
}
