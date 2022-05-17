package basics;

public class FunsDemo {

	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int total(int ... nums) {
		int sum = 0;
		for(int n : nums)
			sum += n;
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		
		System.out.println(total(10,20,30));
		System.out.println(total(1,2,3,33));
	}

}
