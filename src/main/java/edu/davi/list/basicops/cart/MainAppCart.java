package main.java.edu.davi.list.basicops.cart;

public class MainAppCart {
	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.addItem("Coffee", 9.0, 2);

		shoppingCart.listItems();

		shoppingCart.removeItem("Coffee");

		shoppingCart.listItems();

		shoppingCart.addItem("Coffee", 9.0, 2);
		shoppingCart.addItem("sugar", 9.0, 2);

		System.out.println("TOTAL: " + shoppingCart.totalPrice() + "$");
	}
}
