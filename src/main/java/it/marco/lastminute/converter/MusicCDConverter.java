package it.marco.lastminute.converter;

import it.marco.lastminute.dao.MusicCDDao;
import it.marco.lastminute.dto.MusicCD;

public class MusicCDConverter extends GenericConverter<MusicCD, MusicCDDao> {

	/*
	 * METHODS
	 */

	/**
	 * @see GenericConverter
	 */
	public MusicCD convert(MusicCDDao dao) {

		MusicCD musicCD = null;

		if (dao != null) {

			musicCD = new MusicCD(dao.getAmount(), dao.getImported());
		}

		return musicCD;
	}
}
