package main.java.edu.davi.set.basicops;

public class MainAppGuest {
	public static void main(String[] args) {
		GuestSet guestSet = new GuestSet();

		guestSet.addGuest("Alice", 1);
		guestSet.addGuest("Peter", 2);
		guestSet.addGuest("Marcos", 3);
		guestSet.addGuest("David", 4);
		guestSet.addGuest("Impostor", 4);

		guestSet.allGuests();
		System.out.println(guestSet.getInviteCount());

		guestSet.removeGuestByInviteCode(3);
		guestSet.allGuests();
		System.out.println(guestSet.getInviteCount());



	}
}
