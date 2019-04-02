package it.marco.lastminute.converter;

import it.marco.lastminute.dao.ItemDao;
import it.marco.lastminute.dto.ExemptedItem;
import it.marco.lastminute.dto.Item;
import it.marco.lastminute.dto.TaxableItem;

public class ItemConverter extends GenericConverter<Item, ItemDao> {

	/*
	 * METHODS
	 */

	/**
	 * @see GenericConverter
	 */
	public Item convert(ItemDao dao) {

		Item item = null;

		if (dao != null) {

			if (dao.getTaxable()) {

				item = new TaxableItem(dao.getType(), dao.getAmount(), dao.getImported());
			}
			else {

				item = new ExemptedItem(dao.getType(), dao.getAmount(), dao.getImported());
			}
		}

		return item;
	}
}
