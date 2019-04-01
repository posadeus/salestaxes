package it.marco.lastminute;

import it.marco.lastminute.controller.ShoppingBagController;
import it.marco.lastminute.dto.Item;
import it.marco.lastminute.dto.Receipt;
import it.marco.lastminute.factory.FactoryInterface;
import it.marco.lastminute.factory.FirstShoppingBagFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShoppingBags {

	/*
	 * DONE - classes
	 * DONE - constructors
	 * DONE - methods
	 * DONE - read from Resources
	 */

	@Test
	@DisplayName("Test Shopping Bag 1")
	public void testShoppingBag1() {

		ShoppingBagController shoppingBag = new ShoppingBagController();
		FactoryInterface factory = new FirstShoppingBagFactory();

		shoppingBag.doShopping(factory);

		Receipt receipt = new Receipt(shoppingBag);

		List<Item> itemList = shoppingBag.getItemList();

		assertEquals(BigDecimal.valueOf(12.49), itemList.get(0).getFinalPrice());
		assertEquals(BigDecimal.valueOf(0.85), itemList.get(1).getFinalPrice());
		assertEquals(BigDecimal.valueOf(16.49), itemList.get(2).getFinalPrice());

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
}
