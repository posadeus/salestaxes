package it.marco.lastminute.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GenericConverter<T, E> implements ConverterInterface<T, E> {

	/*
	 * METHODS
	 */

	/**
	 * @see ConverterInterface
	 */
	public List<T> convertList(List<E> daoList) {

		List<T> results = new ArrayList<T>();

		if (daoList != null && ! daoList.isEmpty()) {

			results = daoList.stream()
					.map(x -> convert(x))
					.collect(Collectors.toList());
		}

		return results;
	}

	/**
	 * @see ConverterInterface
	 */
	public abstract T convert(E dao);
}
