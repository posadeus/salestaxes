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
	 * DONE - add resource to read
	 * DONE - read from resource
	 * DONE - private variables
	 * DONE - getters & setters
	 * DONE - read Tax in TaxController
	 * DONE - set possible tax foreach item into resource
	 * DONE - change int to Integer to manage NULL values in Tax
	 * DONE - generalize loader in TaxController
	 */

	@Test
	@DisplayName("Test Read Taxes from Resources")
	public void testReadTaxesFromResources() {

		CSVDataLoader loader = new CSVDataLoader();

		List<Tax> taxList = loader.loadTaxes();

		assertEquals(5, taxList.size());

		Tax tax = taxList.get(0);

		assertEquals("book", tax.getItem());
		assertEquals(null, tax.getBaseTax());
		assertEquals(Integer.valueOf(5), tax.getImportTax());

		tax = taxList.get(1);

		assertEquals("chocolate", tax.getItem());
		assertEquals(null, tax.getBaseTax());
		assertEquals(Integer.valueOf(5), tax.getImportTax());

		tax = taxList.get(2);

		assertEquals("headachepills", tax.getItem());
		assertEquals(null, tax.getBaseTax());
		assertEquals(Integer.valueOf(5), tax.getImportTax());

		tax = taxList.get(3);

		assertEquals("musiccd", tax.getItem());
		assertEquals(Integer.valueOf(10), tax.getBaseTax());
		assertEquals(Integer.valueOf(5), tax.getImportTax());

		tax = taxList.get(4);

		assertEquals("perfume", tax.getItem());
		assertEquals(Integer.valueOf(10), tax.getBaseTax());
		assertEquals(Integer.valueOf(5), tax.getImportTax());
	}
}
