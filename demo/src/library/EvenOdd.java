package library;

public class EvenOdd {

	public static void main(String[] args) {
		 int [] a = new int[10];
		 
		 for(int i = 0; i < 10; i ++)
		 {
			 a[i] = (int) Math.round(Math.random() * 100);
		 }
		 
		 for(int n : a) {
			 if (n % 2 == 0 )
				 System.out.println(n);
		 }
	 
		 for(int n : a) {
			 if (n % 2 != 0 )
				 System.out.println(n);
		 }
	}
}
