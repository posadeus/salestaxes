package it.marco.lastminute.dto;

public class Tax {

	/*
	 * VARIABLES
	 */

	private int baseTax;
	private int importTax;

	/*
	 * CONSTRUCTORS
	 */

	public Tax() {}

	/*
	 * METHODS
	 */

	public int getBaseTax() {

		return baseTax;
	}

	public void setBaseTax(int baseTax) {

		this.baseTax = baseTax;
	}

	public int getImportTax() {

		return importTax;
	}

	public void setImportTax(int importTax) {

		this.importTax = importTax;
	}
}
