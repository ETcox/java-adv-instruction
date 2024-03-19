package ui;


import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.Printable;
import model.Product;
import model.Software;

public class ProductManagerApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Project Manager App!");
	
//		//create a couple products
//		Product p1 = new Product("java", "Murach's Java Programming", 59.50);
//		Product p2 = new Product("andr", "Murach's Android Programming", 62.50);
//		
//		List<Product> products = new ArrayList<>();
//		products.add(p1);
//		products.add(p2);
//		
				
//		for (Product p: products) {
//			System.out.println(p);
//		}
//		
		//create a couple products
				
		
				Book b1 = new Book("java", "Murach's Java Programming", 59.50, "Joel Murach");
				Book b2 = new Book("andr", "Murach's Android Programming", 62.50,"Mike Murach");
				
				List<Book> books = new ArrayList<>();
				books.add(b1);
				books.add(b2);
				
		
				Software s1 = new Software("netb", "Netbeans", 0, "v1.1");
				Software s2 = new Software("ecl", "Eclipse", 0, "v7.2");
				
				List<Software> softwares = new ArrayList<>();
				softwares.add(s1);
				softwares.add(s2);
				
				for (Software s: softwares) {
					System.out.println(s);
				}
				
				for (Book b: books) {
					System.out.println(b);
				}
				
				
				List<Product> products = new ArrayList<>();
				products.add(b1);
				products.add(b2);
				products.add(s1);
				products.add(s2);
				
				for(Product p: products) {
					System.out.println(p);
				}
				
				List<Printable> prodList = new ArrayList<>();
				prodList.add(b1);
				prodList.add(b2);
				prodList.add(s1);
				prodList.add(s2);
		
				System.out.println("Printable loop:");
				for(Printable p: prodList) {
					p.print();
				}
				
		System.out.println("Goodbye!");
	}

}
