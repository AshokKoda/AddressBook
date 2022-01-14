package repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import entity.Address;
import entity.Person;

public class AddressBookRepository {

	public void contactsInAddressBook() {
		
		System.out.println("-----------------Add new contact to address book----------------");
		
		List<Person> myContacts = new ArrayList<Person>();
		Person persons = new Person();
		Address addresses = new Address();
		Scanner scanner = new Scanner(System.in);
		int option;
		
		do {
			System.out.println(
					"1 - Add new contact \n2 - Show Contacts \n0 - Quit \nEnter your option:");
			option = scanner.nextInt();
			
			switch (option) {
			/*
			 * Add New Contact Person
			 */
			case 1:
				System.out.print("Enter the First Name : ");
				persons.setFirstName(scanner.next());
				System.out.print("Enter the Last Name : ");
				persons.setLastName(scanner.next());
				System.out.print("Enter the Email ID : ");
				persons.setEmail(scanner.next());
				System.out.print("Enter the City Name : ");
				addresses.setCity(scanner.next());
				System.out.print("Enter the State Name : ");
				addresses.setState(scanner.next());
				System.out.print("Enter the zip code : ");
				addresses.setZip(scanner.nextInt());
				System.out.print("Enter the Phone number : ");
				addresses.setPhoneNo(scanner.nextLong());
				
				myContacts.add(persons);
				break;
				
				/*
				 * Print contacts list
				 */
			case 2:
				System.out.println("------------------------------------------------------------------");
				Iterator<Person> printContacts = myContacts.iterator();
				while (printContacts.hasNext()) {
					Person person = printContacts.next();
					System.out.println(person);
				}
				System.out.println("------------------------------------------------------------------");
				break;
			}
			
		}while(option!=0);
}}
