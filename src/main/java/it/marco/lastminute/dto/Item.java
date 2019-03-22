package it.marco.lastminute.dto;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import it.marco.lastminute.constants.Constants;
import it.marco.lastminute.controller.TaxController;

import java.math.BigDecimal;

public abstract class Item {

	/*
	 * VARIABLES
	 */

	protected BigDecimal amount;
	protected BigDecimal finalPrice;
	protected Boolean isTaxable;
	protected Boolean isImported;

	/*
	 * CONSTRUCTORS
	 */

	public Item(BigDecimal amount, Boolean isTaxable, Boolean isImported) {

		this.amount = amount;
		this.finalPrice = amount;
		this.isTaxable = isTaxable;
		this.isImported = isImported;

		if (this.isImported) {

			TaxController.addImportTax(Constants.TAX_FOR_IMPORTED_ITEM, this);
		}
	}

	/*
	 * METHODS
	 */

	public BigDecimal getAmount() {

		return amount;
	}

	public void setAmount(BigDecimal amount) {

		this.amount = amount;
	}

	public BigDecimal getFinalPrice() {

		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {

		this.finalPrice = finalPrice;
	}

	public Boolean getTaxable() {

		return isTaxable;
	}
}
