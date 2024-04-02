package ui;

import model.User;
import util.Console;

public class UserManagerApp {

	public static void main(String[] args) {

			System.out.println("Hello, welcome to the User Manager.");

			
			//create a user
			int id = Console.getInt("Enter user id: ");
			String username = Console.getString("Enter username: ");
			String fn = Console.getString("Enter First name: ");
			String ln = Console.getString("Enter Last name: ");
			
			
			User u = new User(id, username, fn, ln);
			
			
			System.out.println(u.toString());
			
			System.out.println("Goodbye!");
			
	}

}
