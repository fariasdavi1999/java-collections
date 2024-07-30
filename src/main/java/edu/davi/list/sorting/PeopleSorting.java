package main.java.edu.davi.list.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PeopleSorting {

	private final List<Person> people;

	public PeopleSorting() {
		this.people = new ArrayList<>();
	}

	public void addPerson(String name, Integer age, double height) {
		people.add(new Person(name, age, height));
	}

	public List<Person> sortByAge() {
		List<Person> result = new ArrayList<>(people);
		Collections.sort(result);
		return result;
	}

	public List<Person> sortByHeight() {
		List<Person> result = new ArrayList<>(people);
        result.sort(new ComparatorByHeight());
        return result;
	}

}
