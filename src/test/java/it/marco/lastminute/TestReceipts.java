package it.marco.lastminute;

import it.marco.lastminute.controller.TaxController;
import it.marco.lastminute.dto.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReceipts {

	/*
	 * DONE - Classes Book, MusicCD, Chocolate, Receipt
	 * DONE - Constructors
	 * DONE - addTaxes method
	 * DONE - variables
	 * DONE - round double values to 2 decimals
	 * DONE - change tax to percentage
	 * DONE - change double to BigDecimal
	 * DONE - remove duplications
	 * DONE - private variables
	 * DONE - provide getters and setters
	 * DONE - generic Item initialization not allowed
	 * DONE - Receipt multiple Item constructor
	 * DONE - Receipt dynamically calculate totals
	 * DONE - generalize taxable and not taxable items
	 * DONE - move addTax on another class that controls taxes
	 */

	@Test
	@DisplayName("Test First Receipt")
	public void testFirstReceipt() {

		Book book = new Book(BigDecimal.valueOf(12.49), Boolean.FALSE);
		MusicCD musicCD = new MusicCD(BigDecimal.valueOf(14.99), Boolean.FALSE);
		Chocolate chocolate = new Chocolate(BigDecimal.valueOf(0.85), Boolean.FALSE);

		// FIXME remove this
		//TaxController.addTax(10, musicCD);

		Receipt receipt = new Receipt(book, musicCD, chocolate);

		assertEquals(BigDecimal.valueOf(12.49), book.getFinalPrice());
		assertEquals(BigDecimal.valueOf(16.49), musicCD.getFinalPrice());
		assertEquals(BigDecimal.valueOf(0.85), chocolate.getFinalPrice());

		assertEquals(BigDecimal.valueOf(1.50).setScale(2), receipt.getTotalTaxesAmount());
		assertEquals(BigDecimal.valueOf(29.83), receipt.getTotalAmount());
	}

	/*
	 * TODO
	 * DONE - Classes Chocolate, Perfume
	 * DONE - Constructors
	 * DONE - addImportTax method
	 * DONE - variables
	 * DONE - remove duplications
	 * DONE - add imported variable
	 * DONE - automatically tax TaxableItem
	 * DONE - automatically tax imported Item
	 * - editable tax value
	 * - editable import tax value
	 */

	@Test
	@DisplayName("Test Second Receipt")
	public void testSecondReceipt() {

		Chocolate importedChocolate = new Chocolate(BigDecimal.valueOf(10.00).setScale(2), Boolean.TRUE);
		Perfume importedPerfume = new Perfume(BigDecimal.valueOf(47.50).setScale(2), Boolean.TRUE);

		// FIXME remove these
		//TaxController.addImportTax(5, importedChocolate);
		//TaxController.addTax(10, importedPerfume);
		//TaxController.addImportTax(5, importedPerfume);

		Receipt receipt = new Receipt(importedChocolate, importedPerfume);

		assertEquals(BigDecimal.valueOf(10.50).setScale(2), importedChocolate.getFinalPrice());
		assertEquals(BigDecimal.valueOf(54.65), importedPerfume.getFinalPrice());

		assertEquals(BigDecimal.valueOf(7.65), receipt.getTotalTaxesAmount());
		assertEquals(BigDecimal.valueOf(65.15), receipt.getTotalAmount());
	}
}
