package oop2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		int total = 0;

		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 5; ) {
			System.out.print("Enter number :");
			try {
				total +=  Integer.parseInt(s.nextLine());
				i ++;
			} catch (NumberFormatException ex) {
				System.out.println("Sorry! Invalid input. Please enter a valid number");
			}
		}

		System.out.println(total);

	}

}
