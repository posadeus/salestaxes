package it.marco.lastminute.converter;

import it.marco.lastminute.dao.TaxDao;
import it.marco.lastminute.dto.Tax;

public class TaxConverter extends GenericConverter<Tax, TaxDao> {

	/*
	 * METHODS
	 */

	/**
	 * @see GenericConverter
	 */
	public Tax convert(TaxDao dao) {

		Tax tax = null;

		if (dao != null) {

			tax = new Tax();
			tax.setItem(dao.getItem());
			tax.setBaseTax(dao.getBaseTax());
			tax.setImportTax(dao.getImportTax());
		}

		return tax;
	}
}
