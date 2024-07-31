package main.java.edu.davi.map.sorting;


import java.time.LocalDate;

public class MainAppEvent {
	public static void main(String[] args) {

		EventAgenda eventAgenda = new EventAgenda();

		eventAgenda.addEvent(LocalDate.of(2022, 8, 25), "Event 2", "TWO");
		eventAgenda.addEvent(LocalDate.of(2024, 7, 22), "Event 3", "THREE");
		eventAgenda.addEvent(LocalDate.of(2024, 7, 30), "Event 4", "FOUR");
		eventAgenda.addEvent(LocalDate.of(2024, 8, 22), "Event 5", "FIVE");
		eventAgenda.addEvent(LocalDate.of(2025, 7, 22), "Event 1", "ONE");

		eventAgenda.showAgenda();

		eventAgenda.nextEvent();

	}
}
