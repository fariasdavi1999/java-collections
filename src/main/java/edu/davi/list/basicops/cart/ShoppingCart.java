package main.java.edu.davi.list.basicops.cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private final List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<>();
	}

	public void addItem(String name, double price, int quantity) {
		items.add(new Item(name, price, quantity));
	}

	public void removeItem(String name) {
		List<Item> itemToRemove = new ArrayList<>();
		for (Item item : items) {
			if (item.getName().equals(name)) {
				itemToRemove.add(item);
			} else {
				System.out.println("Empty Cart");
			}
		}
		items.removeAll(itemToRemove);
	}

	public double totalPrice() {
		double totalPrice = 0.0;
		for (Item item : items) {
			double itemPrice = item.getPrice() * item.getQuantity();
			totalPrice += itemPrice;
		}
		return totalPrice;
	}

	public void listItems() {
		if (!items.isEmpty()) {
			System.out.println(items);
		} else {
			System.out.println("No items");
		}
	}
}
