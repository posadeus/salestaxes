package it.marco.lastminute.controller;

import it.marco.lastminute.dto.Item;
import it.marco.lastminute.factory.FactoryInterface;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBagController {

	/*
	 * VARIABLES
	 */

	private List<Item> itemList;

	/*
	 * CONSTRUCTORS
	 */

	public ShoppingBagController() {

	}

	/*
	 * METHODS
	 */

	public void doShopping(FactoryInterface factory) {

		this.itemList = new ArrayList<Item>();

		this.itemList.addAll(factory.createExemptedItems());
		this.itemList.addAll(factory.createTaxableItems());
	}

	public List<Item> getItemList() {

		return itemList;
	}

	public void setItemList(List<Item> itemList) {

		this.itemList = itemList;
	}
}
