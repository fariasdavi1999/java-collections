package main.java.edu.davi.set.sorting;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductsRegister {
	private Set<Product> products;

	public ProductsRegister() {
		this.products = new HashSet<>();
	}

	public void addProduct(int code, String name, double price, int quantity) {
		this.products.add(new Product(code, name, price, quantity));
	}

	public Set<Product> sortProductByName() {
//		Set<Product> sortedProducts = new TreeSet<>(products);
//        return sortedProducts;
		return new TreeSet<>(products);
	}

	public Set<Product> sortByPrice() {
		Set<Product> sortedProducts = new TreeSet<>(new ComparatorByPrice());
		sortedProducts.addAll(products);
		return sortedProducts;
	}
}
