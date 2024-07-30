package main.java.edu.davi.set.sorting;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
	private int code;
	private String name;
	private double price;
	private int quantity;

	public Product(int code, String name, double price, int quantity) {
		this.code     = code;
		this.name     = name;
		this.price    = price;
		this.quantity = quantity;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Product{" + "code= " +
		       code + ", name= '" +
		       name + '\'' + ", price= " +
		       price + ", quantity= " +
		       quantity + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Product product = (Product) o;
		return code == product.code;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(code);
	}


	//ordem alfabetica
	@Override
	public int compareTo(Product product) {
		return name.compareToIgnoreCase(product.getName());
	}
}

class ComparatorByPrice implements Comparator<Product> {
	@Override
	public int compare(Product product1, Product product2) {
		return Double.compare(product1.getPrice(), product2.getPrice());
	}
}
