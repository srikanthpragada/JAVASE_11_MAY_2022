package oop;

public class Account {
   // Instance variables
   private int acno;
   private double balance;
   
   // Constructor 
   public Account(int no) {
	   acno = no;
   }
   // Methods 
   public void deposit(double amount) {
	   balance += amount;
   }
   
   public double getBalance() {
	   return balance;
   }
}