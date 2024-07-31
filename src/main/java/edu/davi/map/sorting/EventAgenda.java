package main.java.edu.davi.map.sorting;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EventAgenda {
	private Map<LocalDate, Event> eventsMap;

	public EventAgenda() {
		this.eventsMap = new HashMap<>();
	}

	public void addEvent(LocalDate date, String name, String attraction) {
		eventsMap.put(date, new Event(name, attraction));
	}

	public void showAgenda() {
		Map<LocalDate, Event> events = new TreeMap<>(eventsMap);
		System.out.println(events);
	}

	public void nextEvent() {
		LocalDate atualDate = LocalDate.now();
		Map<LocalDate, Event> events = new TreeMap<>(eventsMap);
		//para chave (localdate), valor(evento) entry
		for (Map.Entry<LocalDate, Event> entry : eventsMap.entrySet()) {
			if (entry.getKey().isEqual(atualDate) || entry.getKey().isAfter(atualDate)) {
				System.out.println("Next event: " + entry.getValue() +
				                   "Date: " + entry.getKey());
				return;
			}
		}
	}

}
