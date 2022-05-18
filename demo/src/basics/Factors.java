package basics;

public class Factors {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Number is missing!");
			return;
		}

		int num = Integer.parseInt(args[0]);

		for (int i = 2; i <= num / 2; i++)
			if (num % i == 0)
				System.out.println(i);
	}

}
