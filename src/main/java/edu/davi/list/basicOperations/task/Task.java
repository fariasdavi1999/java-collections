package main.java.edu.davi.list.basicOperations.task;

public class Task {

	private String title;

	public Task(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title;
	}
}
