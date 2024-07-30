package main.java.edu.davi.map.basicops;

public class MainAppContact {
	public static void main(String[] args) {
		ContactAgenda contactAgenda = new ContactAgenda();

		contactAgenda.addContact("Alice", 1234567890);
		contactAgenda.addContact("David", 1234);
		contactAgenda.addContact("Lucas", 12345);

		contactAgenda.getAllContacts();

		contactAgenda.removeContact("Alice");
		contactAgenda.getAllContacts();

		System.out.println(contactAgenda.getByName("Lucas"));


	}
}
