package ui;

import java.util.ArrayList;

import db.UserDb;
import db.VendorDb;
import model.User;
import model.Vendor;

public class PrsConsoleJdbcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to JDBC Console App!");
		
//		//1 - Get all users
//		ArrayList<User> users = UserDb.getAll();
//		if (users != null) {
//			
//			System.out.println("List of users");
//			System.out.println("========================");
//			for(User u: users) {
//				System.out.println(u);
//			}
//		}
//		else {
//			System.out.println("Error - check logs");
//		}
//		
//		System.out.println("Get User by Id (3) :");
//		User user = UserDb.getById(3);
//		if (user != null) {
//			System.out.println(user);
//		}
//		else {
//			System.out.println("Error - check logs");
//		}
//		
//		
//		
//		
//		
//		System.out.println("Add a user:");
//		
//		User u = new User(0, "duser", "pwd123", "FirstName", "Lastname", "123-123-1543", "duser@test", false , true);
//		if (UserDb.add(u)) {
//			System.out.println("Success - user added.");
//		}
//		else {
//			System.out.println("Error adding user.");
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		System.out.println("Delete a user");
//		if (UserDb.delete(6)) {
//			System.out.println("User 6 deleted");
//		}
//		else {
//			System.out.println("Error deleting user.");
//		}
//		
		
		ArrayList<Vendor> vendors = VendorDb.getAll();
		if (vendors != null) {
			
			System.out.println("List of vendors");
			System.out.println("========================");
			for(Vendor v: vendors) {
				System.out.println(v);
			}
		}
		else {
			System.out.println("Error - check logs");
		}
		
		
		

		System.out.println("Delete a vendor");
		if (VendorDb.delete(11)) {
			System.out.println("Vendor 10 deleted");
		}
		else {
			System.out.println("Error deleting vendor.");
		}
		
		
		
		System.out.println("Add a vendor:");
		
		Vendor v = new Vendor(0, "RS", "RadioShack", "ElectricSlide", "Cincinnati", "OH", "12345", "123-123-1234" , "Testmail");
		if (VendorDb.add(v)) {
			System.out.println("Success - vendor added.");
			System.out.println(v);
		}
		else {
			System.out.println("Error adding vendor.");
		}
		
		
		
		
		System.out.println("Get Vendor by Id (0) :");
		Vendor vendor = VendorDb.getById(0);
		if (vendor != null) {
			System.out.println(vendor);
		}
		else {
			System.out.println("Error - check logs");
		}
		
		
		
		
		
		

		
		
		System.out.println("Goodbye!");

	}

}
