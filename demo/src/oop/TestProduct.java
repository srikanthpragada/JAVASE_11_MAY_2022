package oop;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("Bose Headphones", 25000);
		p1.setPrice(23000);
		System.out.println(p1.getSellingPrice());
	}

}
