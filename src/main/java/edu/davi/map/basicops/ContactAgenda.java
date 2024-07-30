package main.java.edu.davi.map.basicops;

import java.util.HashMap;
import java.util.Map;

public class ContactAgenda {

	private Map<String, Integer> contactsMap;

	public ContactAgenda() {
		this.contactsMap = new HashMap<>();
	}

	public void addContact(String name, Integer phoneNumber) {
		contactsMap.put(name, phoneNumber);
	}

	public void removeContact(String name) {
		if (!contactsMap.isEmpty()) {
			contactsMap.remove(name);
		}
	}

	public void getAllContacts() {
		System.out.println(contactsMap);
	}

	public Integer getByName(String name) {
		Integer contactNumber = null;
		if (!contactsMap.isEmpty()) {
			contactNumber = contactsMap.get(name);
		}
		return contactNumber;
	}

}
