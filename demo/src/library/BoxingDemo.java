package library;

public class BoxingDemo {

	public static void test(Object obj) {
		System.out.println(obj.getClass());
	}

	public static void main(String[] args) {
		test(new Integer(10));
		test(100);     // autoboxing
		test(10.50);
	}

}
