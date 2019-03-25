package it.marco.lastminute.dao;

public class TaxDao implements DaoInterface {

	/*
	 * VARIABLES
	 */

	private String item;
	private Integer baseTax;
	private Integer importTax;

	/*
	 * CONSTRUCTORS
	 */

	public TaxDao() {}

	/*
	 * METHODS
	 */

	public String getItem() {

		return item;
	}

	public void setItem(String item) {

		this.item = item;
	}

	public Integer getBaseTax() {

		return baseTax;
	}

	public void setBaseTax(Integer baseTax) {

		this.baseTax = baseTax;
	}

	public Integer getImportTax() {

		return importTax;
	}

	public void setImportTax(Integer importTax) {

		this.importTax = importTax;
	}
}
