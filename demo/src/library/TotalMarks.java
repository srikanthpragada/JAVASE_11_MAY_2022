package library;

public class TotalMarks {
	public static void main(String[] args) {
		String st = "89,45,55,67,80";

		int total = 0;
		for (String m : st.split(",")) {
			total += Integer.parseInt(m);
		}

		System.out.println(total);
	}
}
