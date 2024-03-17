import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Console;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Prime Number Checker App!");

		
		String choice = "y";
		
		// while loop - while choice is y or Y
		while(choice.equalsIgnoreCase("y")) {
		
			// prompt for theNumber
			int theNumber = Console.getInt("Enter a whole number between 1 and 5000; ",0, 5001);
			
			System.out.println("Please enter an integer between 1 and 5000");
			//business logic:
			//- what is the business logic?
			//- a prime number is only evenly divisible by itself and 1
			//- define a factorsList
			List<Integer> factorsList = new ArrayList<>();
			//- loop from 1 to theNumber
			for (int i = 1; i<= theNumber; i++) {
				
				//	-modulus theNumber % i
				// 	- if remainder is 0 add i to our factorsList
				if (theNumber % i == 0) {
					
					factorsList.add(i);
				}
				
				
			}
			
			
			
			// print:
			// - prime number (factorsList size is 2)
			// - OR print the # of factors and the factors
			if (factorsList.size()==2) {
				System.out.println(theNumber+" is prime.");
				}
			else {
				StringBuilder factorsStr = new StringBuilder();
				for(int factor: factorsList) {
					factorsStr.append(factor + " ");
				}
				System.out.println(factorsList.size() + " factors: "+factorsStr);
			}
				
		
		
		
			choice = Console.getString("Continue? (y/n) ");
		
		
		
		
	}
		
		
		
		System.out.println("Goodbye!");
	}

}
