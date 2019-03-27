package it.marco.lastminute;

import com.sun.org.apache.xpath.internal.operations.Bool;
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
	 * DONE - print receipt
	 */

	@Test
	@DisplayName("Test First Receipt")
	public void testFirstReceipt() {

		Book book = new Book(BigDecimal.valueOf(12.49), Boolean.FALSE);
		MusicCD musicCD = new MusicCD(BigDecimal.valueOf(14.99), Boolean.FALSE);
		Chocolate chocolate = new Chocolate(BigDecimal.valueOf(0.85), Boolean.FALSE);

		Receipt receipt = new Receipt(book, musicCD, chocolate);

		assertEquals(BigDecimal.valueOf(12.49), book.getFinalPrice());
		assertEquals(BigDecimal.valueOf(16.49), musicCD.getFinalPrice());
		assertEquals(BigDecimal.valueOf(0.85), chocolate.getFinalPrice());

		assertEquals(BigDecimal.valueOf(1.50).setScale(2), receipt.getTotalTaxesAmount());
		assertEquals(BigDecimal.valueOf(29.83), receipt.getTotalAmount());

		String printedReceipt = receipt.print();

		assertEquals(Boolean.TRUE, printedReceipt.contains("Book"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("12.49"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("MusicCD"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("16.49"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("Chocolate"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("0.85"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("29.83"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("1.50"));
	}

	/*
	 * DONE - Classes Chocolate, Perfume
	 * DONE - Constructors
	 * DONE - addImportTax method
	 * DONE - variables
	 * DONE - remove duplications
	 * DONE - add imported variable
	 * DONE - automatically tax TaxableItem
	 * DONE - automatically tax imported Item
	 * DONE - editable tax value (into code)
	 * DONE - editable import tax value (into code)
	 * DONE - print receipt
	 */

	@Test
	@DisplayName("Test Second Receipt")
	public void testSecondReceipt() {

		Chocolate importedChocolate = new Chocolate(BigDecimal.valueOf(10.00).setScale(2), Boolean.TRUE);
		Perfume importedPerfume = new Perfume(BigDecimal.valueOf(47.50).setScale(2), Boolean.TRUE);

		Receipt receipt = new Receipt(importedChocolate, importedPerfume);

		assertEquals(BigDecimal.valueOf(10.50).setScale(2), importedChocolate.getFinalPrice());
		assertEquals(BigDecimal.valueOf(54.65), importedPerfume.getFinalPrice());

		assertEquals(BigDecimal.valueOf(7.65), receipt.getTotalTaxesAmount());
		assertEquals(BigDecimal.valueOf(65.15), receipt.getTotalAmount());

		String printedReceipt = receipt.print();

		assertEquals(Boolean.TRUE, printedReceipt.contains("Chocolate"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("10.50"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("Perfume"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("54.65"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("65.15"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("7.65"));
	}

	/*
	 * TODO
	 * DONE - Classes HeadachePills
	 * DONE - fix rounding
	 * DONE - print receipt
	 */

	@Test
	@DisplayName("Test Third Receipt")
	public void testThirdReceipt() {

		Perfume importedPerfume = new Perfume(BigDecimal.valueOf(27.99), Boolean.TRUE);
		Perfume perfume = new Perfume(BigDecimal.valueOf(18.99), Boolean.FALSE);
		HeadachePills headachePills = new HeadachePills(BigDecimal.valueOf(9.75), Boolean.FALSE);
		Chocolate importedChocolate = new Chocolate(BigDecimal.valueOf(11.25), Boolean.TRUE);

		Receipt receipt = new Receipt(importedPerfume, perfume, headachePills, importedChocolate);

		assertEquals(BigDecimal.valueOf(32.19), importedPerfume.getFinalPrice());
		assertEquals(BigDecimal.valueOf(20.89), perfume.getFinalPrice());
		assertEquals(BigDecimal.valueOf(9.75), headachePills.getFinalPrice());
		assertEquals(BigDecimal.valueOf(11.85), importedChocolate.getFinalPrice());

		assertEquals(BigDecimal.valueOf(6.70).setScale(2), receipt.getTotalTaxesAmount());
		assertEquals(BigDecimal.valueOf(74.68), receipt.getTotalAmount());

		String printedReceipt = receipt.print();

		assertEquals(Boolean.TRUE, printedReceipt.contains("Perfume"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("32.19"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("Perfume"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("20.89"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("HeadachePills"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("9.75"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("Chocolate"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("11.85"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("74.68"));
		assertEquals(Boolean.TRUE, printedReceipt.contains("6.70"));
	}
}
