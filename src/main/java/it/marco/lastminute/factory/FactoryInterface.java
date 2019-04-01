package it.marco.lastminute.factory;

import it.marco.lastminute.dto.ExemptedItem;
import it.marco.lastminute.dto.TaxableItem;

import java.util.List;

public interface FactoryInterface {

	List<ExemptedItem> createExemptedItems();
	List<TaxableItem> createTaxableItems();
}
