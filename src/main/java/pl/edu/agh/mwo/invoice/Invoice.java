package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private HashMap <Product, Integer> products = new HashMap <>();
	private BigDecimal subtotal;

	public void addProduct(Product product) {
		this.products.put(product, 1);
	}

	public void addProduct(Product product, Integer quantity) {
		this.products.put(product, quantity);
		}

	public BigDecimal getSubtotal() {
//		for (Product product : this.products) {
//
//		}
		return BigDecimal.ZERO;
	}

	public BigDecimal getTax() {
		return BigDecimal.ZERO;
	}

	public BigDecimal getTotal() {
		return BigDecimal.ZERO;
	}
}
