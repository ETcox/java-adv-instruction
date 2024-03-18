package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.LineItem;
import model.Product;
import model.Request;
import model.User;
import model.Vendor;
import util.Console;

public class PrsConsoleApp {

	private static final String COMMAND_SHOW = "1";
	private static final String COMMAND_ADD = "2";
	private static final String COMMAND_GET = "3";
	private static final String COMMAND_EXIT = "4";

	public static void main(String[] args) {
		System.out.println("Welcome to my Prs Console App!");

		String command = "";

		User u1 = new User(1, "bobby", "password", "Bob", "Smith", "123-123-1234", "randomemail@as.com", false, false);
		User u2 = new User(2, "bobbyson", "password1", "Bobson", "Smith", "123-123-4321", "random.com", false, false);
		User u3 = new User(3, "bobbymom", "password2", "Bobmom", "Smith", "123-321-2314", "defrandom.com", false,
				false);

		List<User> usersList = new ArrayList<>();
		usersList.add(u1);
		usersList.add(u2);
		usersList.add(u3);

		Vendor v1 = new Vendor();
		Product p1 = new Product();
		LineItem l1 = new LineItem();

		Request r1 = new Request(1, u1, "newrequest", "I need it", LocalDate.now(), "Pickup", "NEW", 0.0,
				LocalDateTime.now(), null);

		String choice = "y";

		System.out.println("Users:");
		System.out.println("=================");
		System.out.println(u1);
		System.out.println(u2.toString());
		System.out.println("=================");
		System.out.println("Request:");
		System.out.println("=================");
		System.out.println(r1);

		while (!command.equalsIgnoreCase(COMMAND_EXIT)) {
			command = commandPrompt();
			// if or switch statement
			// (itemList) is showing that it interacts with the list we made
			switch (command) {
			case COMMAND_SHOW:
				showUsers(usersList);
				break;
			case COMMAND_ADD:
				addUsers(usersList);
				break;
			case COMMAND_GET:
				getUsers(usersList);
				break;

		
			// doesn't necessarily need a method? this loop/App ends when chosen
			case COMMAND_EXIT:
				System.out.println("Exit app:");
				break;
				
			default:
				System.out.println("Invalid command.");

			}
		}
		System.out.println("Goodbye!");
	}

	private static void getUsers(List<User> usersList) {
		// TODO Auto-generated method stub
		
	}

	private static String commandPrompt() {

		System.out.println("COMMAND MENU:");
		System.out.println("----------------------");
		System.out.println(COMMAND_SHOW + " : Show all users");
		System.out.println(COMMAND_ADD + " : Add a new user");
		System.out.println(COMMAND_GET + " : Get user by Id");
		System.out.println(COMMAND_EXIT + " : Exits app");

		return Console.getString("Command: ");

	}

	private static void showUsers(List<User> users) {
		System.out.println("Show all users:");
		System.out.println("----------------------");

		// setting first item to 1, then incrementing +1 for rest of items in list
		for (int i = 1; i <= users.size(); i++) {

			// printing new item number in association to position in list
			// have to do (i - 1) since we set first item to 1 in the for loop parameter
			System.out.println(i + ". " + users.get(i - 1));

		}
	}

	private static void addUsers(List<User> users) {

		
        int userId = Console.getInt("Enter user id: ");

        
        String firstName = Console.getString("Enter first name: ");

       
        String lastName = Console.getString("Enter last name: ");

        User user = new User(userId, firstName, lastName);
        users.add(user);

        System.out.println("User added successfully!");
		
		
	}

	private static void getUsers(List<User> users, int userId) {
	   
		for (int i = 1; i <= users.size(); i++)
			System.out.println(i + ". " + users.get(i - 1));
		
		int userNumber = Console.getInt("Enter the number of the user you wish to view: ");
		
		for (int i = 1; i <= users.size(); i++) {
		System.out.println(users.get(userNumber - 1));
		
		}
	}
	
	
	
}
