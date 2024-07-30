package main.java.edu.davi.set.search;

public class MainAppContact {
	public static void main(String[] args) {
		ContactAgenda contactAgenda = new ContactAgenda();

		contactAgenda.addContact("David", 123);
		contactAgenda.addContact("Luke", 123456789);
		contactAgenda.addContact("Jonas", 12345);

		System.out.println(contactAgenda.getAllContacts());

		System.out.println(contactAgenda.getContactsByName("Jonas"));

		System.out.println(contactAgenda.updatePhoneNumber("Jonas", 3030));

		System.out.println(contactAgenda.getAllContacts());

	}
}
