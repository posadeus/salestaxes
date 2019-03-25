package it.marco.lastminute.converter;

import it.marco.lastminute.dao.DaoInterface;
import it.marco.lastminute.dao.TaxDao;
import it.marco.lastminute.dto.Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaxConverter implements ConverterFromDaoToItemInterface<Tax> {

	public List<Tax> convertList(List<DaoInterface> daoList) {

		List<Tax> results = new ArrayList<Tax>();

		if (daoList != null && ! daoList.isEmpty()) {

			TaxConverter converter = new TaxConverter();

			results = daoList.stream()
					.map(converter::convert)
					.collect(Collectors.toList());
		}

		return results;
	}

	public Tax convert(DaoInterface dao) {

		Tax tax = null;

		if (dao != null) {

			TaxDao taxDao = (TaxDao) dao;

			tax = new Tax();
			tax.setItem(taxDao.getItem());
			tax.setBaseTax(taxDao.getBaseTax());
			tax.setImportTax(taxDao.getImportTax());
		}

		return tax;
	}
}
