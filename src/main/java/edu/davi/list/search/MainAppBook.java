package main.java.edu.davi.list.search;

public class MainAppBook {
	public static void main(String[] args) {
		BookCatalog bookCatalog = new BookCatalog();

		bookCatalog.addBook("1984", "George Orwell", 1949);
		bookCatalog.addBook("Two Thousend", "Paul George", 1990);
		bookCatalog.addBook("Narnia", "John", 2002);
		bookCatalog.addBook("Narnia 2", "John", 2004);

		System.out.println(bookCatalog.getBookByTitle("Narnia 2"));
		System.out.println(bookCatalog.getBookByAuthor("John"));
		System.out.println(bookCatalog.getBookByPublicYear(1950,2010));

	}

}
