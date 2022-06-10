package oop;

public class Account {
	// Instance variables
	private int acno;
	private double balance;
	// Class variable
	private static int minbal = 5000;
	
	public static int getMinbal() {
		return minbal;
	}

	// Constructor
	public Account(int acno) {
		this.acno = acno;
	}

	public Account(int acno, double balance) {
		this(acno); // calling constructor 
		this.balance = balance;
	}

	// Methods
	public void deposit(double amount) {
		if (amount < 1) {
			throw new IllegalArgumentException("Invalid amount");
		}
		this.balance += amount;
	}

	public double getBalance() {
		return this.balance;
	}
}
