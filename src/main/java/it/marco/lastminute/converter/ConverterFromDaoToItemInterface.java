package it.marco.lastminute.converter;

import it.marco.lastminute.dao.DaoInterface;

import java.util.List;

public interface ConverterFromDaoToItemInterface<T> {

	List<T> convertList(List<DaoInterface> daoList);

	T convert(DaoInterface dao);
}
