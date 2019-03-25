package it.marco.lastminute.loader;

import it.marco.lastminute.dto.Tax;

import java.util.List;

public interface DataLoaderInterface {

	/**
	 * This method loads a List of Tax Object from the correct Resource
	 *
	 * @return		a List of Tax Object
	 */
	public List<Tax> loadTaxes();
}
