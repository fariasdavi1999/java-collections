package main.java.edu.davi.list.task;

public class MainAppTask {
	public static void main(String[] args) {
		TaskList taskList = new TaskList();

		taskList.addTask("Task 1");

		System.out.println("TOTAL: " + taskList.taskListSize());

		taskList.listTasks();
	}
}
