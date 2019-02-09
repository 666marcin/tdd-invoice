package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {
		if (name == null) {
			throw new IllegalArgumentException("Name cannot be null");
		}
		
		this.name = name;
		this.price = price;
		this.taxPercent = tax;
	}

	public String getName() {
		return this.name; //moze byc bez this na poczatku ale jest czytlniejsze
	}

	public BigDecimal getPrice() {
		return this.price; //moze byc bez this na poczatku ale jest czytlniejsze
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent; //moze byc bez this na poczatku ale jest czytlniejsze
	}

	public BigDecimal getPriceWithTax() {

		return  this.price.add(this.price.multiply(this.taxPercent)); //moze byc bez this na poczatku ale jest czytlniejsze
	}
}
