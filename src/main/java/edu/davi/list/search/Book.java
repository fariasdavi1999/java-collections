package main.java.edu.davi.list.search;

public class Book {

	private String title;
	private String author;
	private int publicYear;

	public Book(String title, String author, int publicYear) {
		this.title = title;
		this.author = author;
		this.publicYear = publicYear;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicYear() {
		return publicYear;
	}

	@Override
	public String toString() {
		return "Livro [title=" + title + ", author=" + author + ", publicYear=" + publicYear + "]";
	}
}
