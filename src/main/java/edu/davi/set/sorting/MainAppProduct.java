package main.java.edu.davi.set.sorting;

public class MainAppProduct {
	public static void main(String[] args) {
		ProductsRegister productsRegister = new ProductsRegister();

		productsRegister.addProduct(1, "Coffee", 12.0, 1);
		productsRegister.addProduct(3, "Soap", 20, 1);
		productsRegister.addProduct(4, "Sugar", 9.0, 1);

		System.out.println(productsRegister.sortProductByName());

		System.out.println(productsRegister.sortByPrice());

	}
}
