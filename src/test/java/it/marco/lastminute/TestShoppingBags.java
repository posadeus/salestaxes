package it.marco.lastminute;

import it.marco.lastminute.controller.ShoppingBagController;
import it.marco.lastminute.dto.Item;
import it.marco.lastminute.dto.Receipt;
import it.marco.lastminute.factory.FactoryInterface;
import it.marco.lastminute.factory.FirstShoppingBagFactory;
import it.marco.lastminute.factory.SecondShoppingBagFactory;
import it.marco.lastminute.factory.ThirdShoppingBagFactory;
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

	/*
	 * DONE - classes
	 * DONE - constructors
	 * DONE - methods
	 * DONE - read from Resources
	 */

	@Test
	@DisplayName("Test Shopping Bag 2")
	public void testShoppingBag2() {

		ShoppingBagController shoppingBag = new ShoppingBagController();
		FactoryInterface factory = new SecondShoppingBagFactory();

		shoppingBag.doShopping(factory);

		Receipt receipt = new Receipt(shoppingBag);

		List<Item> itemList = shoppingBag.getItemList();

		assertEquals(BigDecimal.valueOf(10.50).setScale(2), itemList.get(0).getFinalPrice());
		assertEquals(BigDecimal.valueOf(54.65), itemList.get(1).getFinalPrice());

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
	 * DONE - classes
	 * DONE - constructors
	 * DONE - methods
	 * DONE - read from Resources
	 */

	@Test
	@DisplayName("Test Shopping Bag 3")
	public void testShoppingBag3() {

		ShoppingBagController shoppingBag = new ShoppingBagController();
		FactoryInterface factory = new ThirdShoppingBagFactory();

		shoppingBag.doShopping(factory);

		Receipt receipt = new Receipt(shoppingBag);

		List<Item> itemList = shoppingBag.getItemList();

		assertEquals(BigDecimal.valueOf(11.85), itemList.get(0).getFinalPrice());
		assertEquals(BigDecimal.valueOf(9.75), itemList.get(1).getFinalPrice());
		assertEquals(BigDecimal.valueOf(32.19), itemList.get(2).getFinalPrice());
		assertEquals(BigDecimal.valueOf(20.89), itemList.get(3).getFinalPrice());

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
