package it.marco.lastminute.dto;

public class Tax {

	/*
	 * VARIABLES
	 */

	public int baseTax;
	public int importTax;

	/*
	 * CONSTRUCTORS
	 */

	public Tax(int baseTax, int importTax) {

		this.baseTax = baseTax;
		this.importTax = importTax;
	}
}
