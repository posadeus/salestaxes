package it.marco.lastminute.converter;

import java.util.List;

public interface ConverterInterface<T, E> {

	/**
	 * This method converts from a List of E to a List of T
	 *
	 * @param daoList	List of elements to convert
	 *
	 * @return			List of elements converted
	 */
	List<T> convertList(List<E> daoList);

	/**
	 * This method converts an element of type E to an element of type T
	 *
	 * @param dao		element to convert
	 *
	 * @return			element converted
	 */
	T convert(E dao);
}
