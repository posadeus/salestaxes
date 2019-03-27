package it.marco.lastminute.converter;

import it.marco.lastminute.dao.PerfumeDao;
import it.marco.lastminute.dto.Perfume;

public class PerfumeConverter extends GenericConverter<Perfume, PerfumeDao> {

	/*
	 * METHODS
	 */

	/**
	 * @see GenericConverter
	 */
	public Perfume convert(PerfumeDao dao) {

		Perfume perfume = null;

		if (dao != null) {

			perfume = new Perfume(dao.getAmount(), dao.getImported());
		}

		return perfume;
	}
}
