package oop;

public class Account {
   // Instance variables
   private int acno;
   private double balance;
   
   // Methods 
   public void deposit(double amount) {
	   balance += amount;
   }
   
   public double getBalance() {
	   return balance;
   }
}
