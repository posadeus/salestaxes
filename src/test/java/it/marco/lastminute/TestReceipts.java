package it.marco.lastminute;

import it.marco.lastminute.controller.TaxController;
import it.marco.lastminute.dto.Book;
import it.marco.lastminute.dto.Chocolate;
import it.marco.lastminute.dto.MusicCD;
import it.marco.lastminute.dto.Receipt;
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

		Book book = new Book(BigDecimal.valueOf(12.49));
		MusicCD musicCD = new MusicCD(BigDecimal.valueOf(14.99));
		Chocolate chocolate = new Chocolate(BigDecimal.valueOf(0.85));

		TaxController.addTax(10, musicCD);

		Receipt receipt = new Receipt(book, musicCD, chocolate);

		assertEquals(BigDecimal.valueOf(12.49), book.getFinalPrice());
		assertEquals(BigDecimal.valueOf(16.49), musicCD.getFinalPrice());
		assertEquals(BigDecimal.valueOf(0.85), chocolate.getFinalPrice());

		assertEquals(BigDecimal.valueOf(1.50).setScale(2), receipt.getTotalTaxesAmount());
		assertEquals(BigDecimal.valueOf(29.83), receipt.getTotalAmount());
	}

	/*
	 * TODO
	 * - Classes ImportedChocolate, ImportedPerfume
	 * - Constructors
	 * - addImportTax method
	 * - variables
	 */

	@Test
	@DisplayName("Test Second Receipt")
	public void testSecondReceipt() {

		ImportedChocolate importedChocolate = new ImportedChocolate(BigDecimal.valueOf(10.00).setScale(2));
		ImportedPerfume importedPerfume = new ImportedPerfume(BigDecimal.valueOf(47.50).setScale(2));

		TaxController.addImportTax(5, importedChocolate);
		TaxController.addImportTax(5, importedPerfume);

		Receipt receipt = new Receipt(importedChocolate, importedPerfume);

		assertEquals(BigDecimal.valueOf(10.50).setScale(2), importedChocolate.finalPrice);
		assertEquals(BigDecimal.valueOf(54.65), importedPerfume.finalPrice);

		assertEquals(BigDecimal.valueOf(7.65), receipt.getTotalTaxesAmount());
		assertEquals(BigDecimal.valueOf(65.15), receipt.getTotalAmount());
	}
}
