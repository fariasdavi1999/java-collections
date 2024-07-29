package main.java.edu.davi.list.task;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	private final List<Task> tasks;

	public TaskList() {
		this.tasks = new ArrayList<>();
	}

	public void listTasks() {
		System.out.println(tasks);
	}

	public void addTask(String title) {
		tasks.add(new Task(title));
	}

	public void removeTask(String title) {
		List<Task> tasksToRemove = new ArrayList<>();
		for (Task task : tasks) {
			if (task.getDescricao().equals(title)) {
				tasksToRemove.add(task);
			}
		}
		tasks.removeAll(tasksToRemove);
	}

	public int taskListSize() {
		return tasks.size();
	}

}