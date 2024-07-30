package main.java.edu.davi.list.sorting;

public class MainAppPerson {
	public static void main(String[] args) {
		PeopleSorting peopleSorting = new PeopleSorting();

		peopleSorting.addPerson("Name 1", 20, 1.60);
		peopleSorting.addPerson("Name 2", 28, 1.90);
		peopleSorting.addPerson("Name 3", 25, 1.78);
		peopleSorting.addPerson("Name 4", 30, 1.89);

		System.out.println(peopleSorting.sortByAge());

		System.out.println(peopleSorting.sortByHeight());

	}
}
