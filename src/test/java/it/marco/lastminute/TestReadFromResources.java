package it.marco.lastminute;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReadFromResources {

	/*
	 * TODO
	 * - classes Tax, CSVDataLoader
	 * - constructors
	 * - methods
	 * - variables
	 */

	@Test
	@DisplayName("Test Read Taxes from Resources")
	public void testReadTaxesFromResources() {

		List<Tax> taxList = CSVDataLoader.loadTaxes();

		assertEquals(1, taxList.size());

		Tax tax = taxList.get(0);

		assertEquals(10, tax.baseTax);
		assertEquals(5, tax.importTax);
	}
}
