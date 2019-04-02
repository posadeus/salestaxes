package it.marco.lastminute;

import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.dto.*;
import it.marco.lastminute.loader.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReadFromResources {

	/*
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

		CSVDataLoader loader = new TaxLoader();

		List<Tax> taxList = loader.loadData(Constants.CSV_NAME_TAX);

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

	@Test
	@DisplayName("Test Read Books from Resources")
	public void testReadBooksFromResources() {

		CSVDataLoader loader = new ItemLoader();

		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		Item item = itemList.get(0);

		assertEquals("Book", item.getType());
		assertEquals(BigDecimal.valueOf(12.49), item.getAmount());
		assertEquals(Boolean.FALSE, item.getImported());
		assertEquals(Boolean.FALSE, item.getTaxable());
	}

	@Test
	@DisplayName("Test Read MusicCDs from Resources")
	public void testReadMusicCDsFromResources() {

		CSVDataLoader loader = new ItemLoader();

		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		Item item = itemList.get(5);

		assertEquals("MusicCD", item.getType());
		assertEquals(BigDecimal.valueOf(14.99), item.getAmount());
		assertEquals(Boolean.FALSE, item.getImported());
		assertEquals(Boolean.TRUE, item.getTaxable());
	}

	@Test
	@DisplayName("Test Read Chocolates from Resources")
	public void testReadChocolatesFromResources() {

		CSVDataLoader loader = new ItemLoader();

		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		Item item = itemList.get(1);

		assertEquals("Chocolate", item.getType());
		assertEquals(BigDecimal.valueOf(0.85), item.getAmount());
		assertEquals(Boolean.FALSE, item.getImported());
		assertEquals(Boolean.FALSE, item.getTaxable());

		item = itemList.get(2);

		assertEquals("Chocolate", item.getType());
		assertEquals(BigDecimal.valueOf(10.00).setScale(2), item.getAmount());
		assertEquals(Boolean.TRUE, item.getImported());
		assertEquals(Boolean.FALSE, item.getTaxable());

		item = itemList.get(3);

		assertEquals("Chocolate", item.getType());
		assertEquals(BigDecimal.valueOf(11.25), item.getAmount());
		assertEquals(Boolean.TRUE, item.getImported());
		assertEquals(Boolean.FALSE, item.getTaxable());
	}

	@Test
	@DisplayName("Test Read Perfumes from Resources")
	public void testReadPerfumesFromResources() {

		CSVDataLoader loader = new ItemLoader();

		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		Item item = itemList.get(6);

		assertEquals("Perfume", item.getType());
		assertEquals(BigDecimal.valueOf(47.50).setScale(2), item.getAmount());
		assertEquals(Boolean.TRUE, item.getImported());
		assertEquals(Boolean.TRUE, item.getTaxable());

		item = itemList.get(7);

		assertEquals("Perfume", item.getType());
		assertEquals(BigDecimal.valueOf(27.99), item.getAmount());
		assertEquals(Boolean.TRUE, item.getImported());
		assertEquals(Boolean.TRUE, item.getTaxable());

		item = itemList.get(8);

		assertEquals("Perfume", item.getType());
		assertEquals(BigDecimal.valueOf(18.99), item.getAmount());
		assertEquals(Boolean.FALSE, item.getImported());
		assertEquals(Boolean.TRUE, item.getTaxable());
	}

	@Test
	@DisplayName("Test Read HeadachePills from Resources")
	public void testReadHeadachePillsFromResources() {

		CSVDataLoader loader = new ItemLoader();

		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		Item item = itemList.get(4);

		assertEquals("Headache Pills", item.getType());
		assertEquals(BigDecimal.valueOf(9.75), item.getAmount());
		assertEquals(Boolean.FALSE, item.getImported());
		assertEquals(Boolean.FALSE, item.getTaxable());
	}

	@Test
	@DisplayName("Test Read Water from Resources")
	public void testReadWaterFromResources() {

		CSVDataLoader loader = new ItemLoader();

		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		for (Item item : itemList) {

			assertEquals(Boolean.TRUE, item.getType() != "Water");
		}
	}

	/*
	 * - class ItemLoader
	 * - resource
	 * - constant
	 * - Item's variable for type
	 * - refactoring classes
	 * - refactoring test classes
	 */

	@Test
	@DisplayName("Test Read All Items Once")
	public void testReadAllItemsOnce() {

		CSVDataLoader loader = new ItemLoader();

		List<Item> itemList = loader.loadData(Constants.CSV_NAME_ITEMS);

		assertEquals(9, itemList.size());

		assertEquals("Book", itemList.get(0).getType());
		assertEquals("Chocolate", itemList.get(1).getType());
		assertEquals("Chocolate", itemList.get(2).getType());
		assertEquals("Chocolate", itemList.get(3).getType());
		assertEquals("Headache Pills", itemList.get(4).getType());
		assertEquals("MusicCD", itemList.get(5).getType());
		assertEquals("Perfume", itemList.get(6).getType());
		assertEquals("Perfume", itemList.get(7).getType());
		assertEquals("Perfume", itemList.get(8).getType());

		assertEquals(BigDecimal.valueOf(12.49), itemList.get(0).getFinalPrice());
		assertEquals(BigDecimal.valueOf(0.85), itemList.get(1).getFinalPrice());
		assertEquals(BigDecimal.valueOf(10.50).setScale(2), itemList.get(2).getFinalPrice());
		assertEquals(BigDecimal.valueOf(11.85), itemList.get(3).getFinalPrice());
		assertEquals(BigDecimal.valueOf(9.75), itemList.get(4).getFinalPrice());
		assertEquals(BigDecimal.valueOf(16.49), itemList.get(5).getFinalPrice());
		assertEquals(BigDecimal.valueOf(54.65), itemList.get(6).getFinalPrice());
		assertEquals(BigDecimal.valueOf(32.19), itemList.get(7).getFinalPrice());
		assertEquals(BigDecimal.valueOf(20.89), itemList.get(8).getFinalPrice());
	}
}
