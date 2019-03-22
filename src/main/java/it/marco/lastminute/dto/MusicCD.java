package it.marco.lastminute.dto;

public class MusicCD {

	/*
	 * VARIABLES
	 */

	public double amount;
	public double finalPrice;

	/*
	 * CONSTRUCTORS
	 */

	public MusicCD(double amount) {

		this.amount = amount;
		this.finalPrice = amount;
	}

	/*
	 * METHODS
	 */

	public void addTaxes(double taxes) {

		finalPrice += taxes;
	}
}
