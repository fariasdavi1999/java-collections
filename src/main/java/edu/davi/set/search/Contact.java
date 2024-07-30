package main.java.edu.davi.set.search;

import java.util.Objects;

public class Contact {
	private String name;
	private int phoneNumber;

	public Contact(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact{" + "name= '" + name + '\'' + ", phoneNumber= " + phoneNumber + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Contact contact = (Contact) o;
		return phoneNumber == contact.phoneNumber && Objects.equals(name, contact.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phoneNumber);
	}
}
