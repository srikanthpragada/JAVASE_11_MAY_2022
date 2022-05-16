package basics;

import java.util.Scanner;

public class AverageNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number :");
			int n = s.nextInt(); // read int from keyboard
			total += n;
		}

		System.out.println(total / 5.0);
	}

}
