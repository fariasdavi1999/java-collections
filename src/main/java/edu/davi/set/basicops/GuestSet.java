package main.java.edu.davi.set.basicops;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {

	private final Set<Guest> guests;

	public GuestSet() {
		this.guests = new HashSet<>();
	}

	public void addGuest(String name, int inviteCode) {
		guests.add(new Guest(name, inviteCode));
	}

	public void removeGuestByInviteCode(int inviteCode) {
		Guest guestToRemove = null;
		for (Guest guest : guests) {
			if (guest.getInviteCode() == inviteCode) {
				guestToRemove = guest;
				break;
			}
		}
		guests.remove(guestToRemove);
	}

	public int getInviteCount() {
		return guests.size();
	}

	public void allGuests() {
		System.out.println(guests);
	}

}
