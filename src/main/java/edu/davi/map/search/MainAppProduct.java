package main.java.edu.davi.map.search;

public class MainAppProduct {
	public static void main(String[] args) {
		ProductStock productStock = new ProductStock();

		productStock.addProduct(1, "Product 1", 20, 5);
		productStock.addProduct(2, "Product 2", 30, 2);
		productStock.addProduct(3, "Product 3", 50, 6);
		productStock.addProduct(4, "Product 4", 2, 10);

		productStock.allProducts();

		System.out.println(productStock.getTotalStockPrice());

		System.out.println(productStock.getExpensivestProduct());

		System.out.println(productStock.getCheaperProduct());

	}
}
