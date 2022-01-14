package controller;

import java.util.Scanner;

import repository.AddressBookRepository;

public class AddressBookMain {

	public static void main(String[] args) {
		
		System.out.println("---------------Welcome to address book----------------");
		
		AddressBookRepository service = new AddressBookRepository();
		
		Scanner scanner = new Scanner(System.in);
		int option = 1;

		System.out
				.println("1 - Add new contact to address book \n0 - for exit \nEnter your option:");
		option = scanner.nextInt();
		
		switch (option) {
		case 1:
			service.contactsInAddressBook();
			break;
		case 0:
			System.out.println("Thanks you....!!!");
			break;
		default:
			System.out.println("Invalid option");
			break;
		}

	}

}
