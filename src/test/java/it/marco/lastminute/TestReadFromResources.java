package it.marco.lastminute;

import it.marco.lastminute.dto.Tax;
import it.marco.lastminute.loader.CSVDataLoader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReadFromResources {

	/*
	 * TODO
	 * DONE - classes Tax, CSVDataLoader
	 * DONE - constructors
	 * DONE - methods
	 * DONE - variables
	 * - add resource to read
	 */

	@Test
	@DisplayName("Test Read Taxes from Resources")
	public void testReadTaxesFromResources() {

		CSVDataLoader loader = new CSVDataLoader();

		List<Tax> taxList = loader.loadTaxes();

		assertEquals(1, taxList.size());

		Tax tax = taxList.get(0);

		assertEquals(10, tax.baseTax);
		assertEquals(5, tax.importTax);
	}
}
