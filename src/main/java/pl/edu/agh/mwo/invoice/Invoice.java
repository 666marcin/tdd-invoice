package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	protected HashMap<Product, Integer> products = new HashMap<>();
	

	public void addProduct(Product product) {
		this.addProduct(product,1);
	}

	public void addProduct(Product product, Integer quantity) {
		this.products.put(product, quantity);
	}

	
	
	public BigDecimal getSubtotal() {
		BigDecimal subtotal = BigDecimal.ZERO;
		for (Product product : products.keySet()) {
			//BigDecimal productPrice = (product.getPrice()).multiply(products(product).values);
		}
		return subtotal;
	}

	public BigDecimal getTax() {
		return BigDecimal.ZERO;
	}

	public BigDecimal getTotal() {
		return BigDecimal.ZERO;
	}
}
