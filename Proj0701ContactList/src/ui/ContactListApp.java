package ui;

import java.util.Scanner;

import model.Contact;
import util.Console;

public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List App!");

		//Contact c1 = new Contact();
		//c1.setFirstName("Bob");
		//c1.setLastName("Jones");
		//c1.setEmail("bobby@xyz.com");
		//c1.setPhone("123-123-1234");
		
		//System.out.println(c1);
		
				Scanner sc = new Scanner(System.in);
				String choice = "y";
				
				
				//prompt for all 4 instance variables
				String firstName = Console.getString("Enter first name: ");
				String lastName = Console.getString("Enter last name: ");
				String email = Console.getString("Enter email address: ");
				String phone = Console.getString("Enter phone number: ");
				
				Contact contact = new Contact(firstName, lastName, email, phone);
				System.out.println();
				System.out.println(contact.displayContact());
				
		System.out.println("Goodbye!");
	}

}
