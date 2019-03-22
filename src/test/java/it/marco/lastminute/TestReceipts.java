package it.marco.lastminute;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestReceipts {

	/*
	 * TODO
	 * - Classes Book, MusicCD, Chocolate, Receipt
	 * - Constructors
	 * - addTaxes method
	 * - variables
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

		assertEquals(1.50, receipt.totalTaxeAmount);
		assertEquals(29.83, receipt.totalAmount);
	}
}
