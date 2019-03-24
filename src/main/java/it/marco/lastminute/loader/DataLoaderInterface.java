package it.marco.lastminute.loader;

import it.marco.lastminute.dto.Tax;

import java.util.List;

public interface DataLoaderInterface {

	public List<Tax> loadTaxes();
}
