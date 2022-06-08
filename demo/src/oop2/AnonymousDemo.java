package oop2;

public class AnonymousDemo {

	public static void main(String[] args) {
		 // Inner class 
		 class Task implements Runnable {
			 public void run() {
				 
			 }
		 }
		 var v = new Task();
		 v.run();
		 
		 // Anonymous inner class 
		 var t = new Runnable() {
			 public void run() {
				 
			 }
		 };
		 
		 t.run();
		 
	}

}
