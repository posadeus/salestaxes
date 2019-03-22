package it.marco.lastminute;

import it.marco.lastminute.dto.Book;
import it.marco.lastminute.dto.Chocolate;
import it.marco.lastminute.dto.MusicCD;
import it.marco.lastminute.dto.Receipt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReceipts {

	/*
	 * TODO
	 * DONE - Classes Book, MusicCD, Chocolate, Receipt
	 * DONE - Constructors
	 * DONE - addTaxes method
	 * DONE - variables
	 * - round double values to 2 decimals
	 */

	@Test
	@DisplayName("Test First Receipt")
	public void testFirstReceipt() {

		Book book = new Book(12.49);
		MusicCD musicCD = new MusicCD(14.99);
		Chocolate chocolate = new Chocolate(0.85);

		musicCD.addTaxes(1.50);

		Receipt receipt = new Receipt(book, musicCD, chocolate);

		assertEquals(12.49, book.finalPrice);
		assertEquals(16.49, musicCD.finalPrice);
		assertEquals(0.85, chocolate.finalPrice);

		assertEquals(1.50, receipt.totalTaxesAmount);
		assertEquals(29.83, receipt.totalAmount);
	}
}
