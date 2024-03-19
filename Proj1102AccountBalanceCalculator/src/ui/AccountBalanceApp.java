package ui;

import java.text.NumberFormat;

import model.Account;
import model.CheckingAccount;
import model.SavingsAccount;
import util.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {

		String choice = "y";
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();

		CheckingAccount c1 = new CheckingAccount(1, 1000);
		SavingsAccount s1 = new SavingsAccount(.01, 1000);

		System.out.println("Welcome to Account application");

		System.out.println("Starting Balances: ");
		System.out.println("Checking: " + cf.format(c1.getBalance()));
		System.out.println("Savings: " + cf.format(s1.getBalance()));
		System.out.println();

		System.out.println("Enter transactions for the month: \n");

		while (choice.equalsIgnoreCase("y")) {
			String action = Console.getString("Withdrawl or Deposit? (w/d)", "w", "d");
			String account = Console.getString("Checking or savings? (c/s)", "c", "s");
			double amount = Console.getDouble("Amount? ", 0, Double.MAX_VALUE);

			Account acct = null;
			if (account.equalsIgnoreCase("c")) {
				acct = c1;
			}
			else {
				acct = s1;
			}
		
			if(action.equalsIgnoreCase("w")) {
				acct.withdraw(amount);
			}
			else {
				acct.deposit(amount);
			}
			
			
			choice = Console.getString("Continue? (y/n)", "y", "n");
		
		
		
		}

		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking Fee: \t\t\t" + cf.format(c1.getMonthlyFee()));
		s1.calculateMonthlyInterestPayment();
		s1.applyPaymentToBalance();
		System.out.println("Savings Interest Payment: " + cf.format(s1.getMonthlyInterestPayment()));
		System.out.println();
		
		c1.subtractMonthlyFeeFromBalance();
		System.out.println("Final Balances: ");
		System.out.println("Checking " + cf.format(c1.getBalance()));
		System.out.println("Savings" + cf.format(s1.getBalance()));

		System.out.println("Goodbye!");

	}

}
