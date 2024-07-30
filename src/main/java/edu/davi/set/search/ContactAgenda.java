package main.java.edu.davi.set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactAgenda {

	private Set<Contact> contacts;

	public ContactAgenda() {
		this.contacts = new HashSet<>();
	}

	public void addContact(String name, int phoneNumber) {
		this.contacts.add(new Contact(name, phoneNumber));
	}

	public Set<Contact> getAllContacts() {
		return this.contacts;
	}

	public Set<Contact> getContactsByName(String name) {
		Set<Contact> resultContacts = new HashSet<>();
		contacts.forEach(contact -> {
			if (contact.getName().startsWith(name)) {
				resultContacts.add(contact);
			}
		});
		return resultContacts;
	}

	public Contact updatePhoneNumber(String name, int phoneNumber) {
		Contact contactUpdated = null;
		for (Contact contact : contacts) {
			if (contact.getName().equalsIgnoreCase(name)) {
				contact.setPhoneNumber(phoneNumber);
				contactUpdated = contact;
				break;
			}
		}
		return contactUpdated;
	}

}
