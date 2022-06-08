package oop2;

public class ExDemo {

	public static void main(String[] args) {
		 int n = 2;
		 try {
		   int q = 10 / n;
		   System.out.println(q);
		 }
		 catch(ArithmeticException ex) {
			 System.out.println("Invalid number. It cannot be zero");
		 }
		 
		 System.out.println("The End");
	}

}
