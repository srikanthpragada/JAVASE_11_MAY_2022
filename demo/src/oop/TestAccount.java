package oop;

public class TestAccount {
	public static void main(String[] args) {
		 Account a1;  // object reference 
		 
		 a1 = new Account();  // object 
		 a1.deposit(10000);   // calling method 
		 System.out.println(a1.getBalance());
	}

}
