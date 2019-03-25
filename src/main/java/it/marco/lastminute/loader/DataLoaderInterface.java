package it.marco.lastminute.loader;

import java.util.List;

public interface DataLoaderInterface<T> {

	/**
	 * This method loads a List of T Object from the correct Resource
	 *
	 * @param fileName		name of the Resource to read
	 *
	 * @return				a List of T Object
	 */
	public List loadData(String fileName);
}
