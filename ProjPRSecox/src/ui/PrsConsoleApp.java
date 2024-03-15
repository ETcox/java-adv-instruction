package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import model.LineItem;
import model.Product;
import model.Request;
import model.User;
import model.Vendor;
import util.Console;

public class PrsConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to my Prs Console App!");

		User u1 = new User(1, "bobby", "password","Bob", "Smith", 
						   "123-123-1234","randomemail@as.com", false, false);
		User u2 = new User(2, "bobbyson", "password1","Bobson", "Smith",
						   "123-123-4321","random.com", false, false);
		
		Vendor v1 = new Vendor();
		Product p1 = new Product();
		LineItem l1 = new LineItem();
		
		
		Request r1 = new Request(1, u1, "newrequest", "I need it", LocalDate.now(), "Pickup", "NEW", 0.0, LocalDateTime.now(), null);

		
		
		
		
		String choice = "y";

		
		System.out.println("Users:");
		System.out.println("=================");
		System.out.println(u1);
		System.out.println(u2.toString());
		System.out.println("=================");
		System.out.println("Request:");
		System.out.println("=================");
		System.out.println(r1);
		
		
		//while (choice.equalsIgnoreCase("y")) {

			//String Request =

					//System.out.println("Would you like to continue? (y/n)");
		//}

		System.out.println("Goodbye!");
	}

}
