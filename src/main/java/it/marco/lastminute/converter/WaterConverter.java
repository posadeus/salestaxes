package it.marco.lastminute.converter;

import it.marco.lastminute.dao.WaterDao;
import it.marco.lastminute.dto.Water;

public class WaterConverter extends GenericConverter<Water, WaterDao> {

	/*
	 * METHODS
	 */

	/**
	 * @see GenericConverter
	 */
	public Water convert(WaterDao dao) {

		Water water = null;

		if (dao != null) {

			water = new Water(dao.getAmount(), dao.getImported());
		}

		return water;
	}
}
