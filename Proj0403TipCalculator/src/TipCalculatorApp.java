import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to my TipCalculatorApp!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		
		// while loop - while choice = "y" or "Y"
		while (choice.equalsIgnoreCase("y")) {
			
			
			
		
			// 1 - prompt for costOfMeal
			System.out.println("Cost of meal?");
			double costOfMeal = sc.nextDouble();
		
			NumberFormat pctFormat = NumberFormat.getPercentInstance();
			NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
			
			
			// 2 - do business logic and display:
			//	 - loop through 3 tipPercents: .15, .20, .25	
			for(double tipPercent = .15; tipPercent <= .25; tipPercent += .05) {
			
			//	 - calculate tip, totalAmount
				double tip = costOfMeal * tipPercent;
				double totalAmount = costOfMeal + tip;
			// 	 - display tipPercent - formatted as a percent
				System.out.println(pctFormat.format(tipPercent));
			// 	 - display tipAmount - formatted as currency
				System.out.println("Tip Amount:\t"+currencyFormat.format(tip));
			//	 - display totalAmount - formatted as currency
				System.out.println("Tip Amount:\t"+currencyFormat.format(totalAmount));
			
			
			}
			
			// end while loop - prompt for continue?
		
			System.out.print("Continue? (y/n)");
			choice = sc.next();
		}
		
		
			System.out.println("Goodbye!");
	}

}
		
		
	
