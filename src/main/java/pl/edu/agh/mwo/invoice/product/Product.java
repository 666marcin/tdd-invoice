package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {
		if (name == null || name.equals("")) { //wazna kolejnosc przy || bo tak nie poleci nullpointerException, gdybysmy wywolali equals na null 
			throw new IllegalArgumentException("Name cannot be null/empty");
		}
		
		if (price == null) {
			throw new IllegalArgumentException("Price cannot be null");
		}
		
		if (price.compareTo(BigDecimal.ZERO) == -1) { //compare porownuje (zwaraca -1 jesli price bedzie mniejsze od BD.Z, 0 jesli rowne oba, 1 jesli price bedzie wieksze od BD.Z); BigDecimal.Zero - stała w klasie oznaczajaca ZERO
			throw new IllegalArgumentException("Price cannot be minus");
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
