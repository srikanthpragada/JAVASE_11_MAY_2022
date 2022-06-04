package oop;

public class TestAccount {
	public static void main(String[] args) {
 
		 var a1 = new Account(101);  // object 
		 a1.deposit(10000);   // calling method 
		 System.out.println(a1.getBalance());
		 
		 Account a2 = new Account(102, 10000);
		 a2.deposit(100000);
		 
		 
	}

}
