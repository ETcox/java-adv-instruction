package model;

public class Account implements Depositable, Withdrawable, Balanceable{

	private double balance;
	
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void setBalance(double balance) {
		this.balance = balance;
		
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
		
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}

}
