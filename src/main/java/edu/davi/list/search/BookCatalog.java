package main.java.edu.davi.list.search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

	private final List<Book> bookList;

	public BookCatalog() {
		this.bookList = new ArrayList<>();
	}

	public void addBook(String title, String author, int publicYear) {
		bookList.add(new Book(title, author, publicYear));
	}

	public List<Book> getBookByAuthor(String author) {
		List<Book> result = new ArrayList<>();
		if (bookList.isEmpty()) {
			return null;
		} else {
			bookList.forEach(book -> {
				if (book.getAuthor().equalsIgnoreCase(author)) {
					result.add(book);
				}
			});
		}
		return result;
	}

	public List<Book> getBookByPublicYear(int initialYear, int lastYear) {
		List<Book> result = new ArrayList<>();
		if (!bookList.isEmpty()) {
			bookList.forEach(book -> {
				if (book.getPublicYear() >= initialYear && book.getPublicYear() <= lastYear) {
					result.add(book);
				}
			});
		}
		return result;
	}

	public Book getBookByTitle(String title) {
		Book bookResult = null;
		if (!bookList.isEmpty()) {
			for (Book book : bookList) {
				if (book.getTitle().equalsIgnoreCase(title)) {
					bookResult = book;
					break;
				}
			}
		}
		return bookResult;
	}

}
