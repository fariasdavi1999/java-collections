package main.java.edu.davi.map.search;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {

	private Map<Long, Product> productMap;

	public ProductStock() {
		this.productMap = new HashMap<>();
	}

	public void addProduct(long code, String name, double price, int quantity) {
		productMap.put(code, new Product(name, price, quantity));
	}

	public void allProducts() {
		System.out.println(productMap);
	}

	public double getTotalStockPrice() {
		double totalPrice = 0.0;
		if (!productMap.isEmpty()) {
			for (Product product : productMap.values()) {
				totalPrice += product.getPrice() * product.getQuantity();
			}
		}
		return totalPrice;
	}

	public Product getExpensivestProduct() {
		double expensivestPrice = Double.MIN_VALUE;
		Product mostExpensiveProduct = null;
		if (!productMap.isEmpty()) {
			for (Product product : productMap.values()) {
				if (product.getPrice() > expensivestPrice) {
					expensivestPrice     = product.getPrice();
					mostExpensiveProduct = product;
				}
			}
		}
		return mostExpensiveProduct;
	}

	public Product getCheaperProduct() {
		double cheaperPrice = Double.MAX_VALUE;
		Product mostCheapProduct = null;
		if (!productMap.isEmpty()) {
			for (Product product : productMap.values()) {
				if (product.getPrice() < cheaperPrice) {
					cheaperPrice     = product.getPrice();
					mostCheapProduct = product;
				}
			}
		}
		return mostCheapProduct;
	}

}
