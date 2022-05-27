package oop;

public class Product {
	private String name;
	private double price;
	private static double taxrate = 5;
	
	public static double getTaxrate() {
		return taxrate;
	}

	public static void setTaxrate(double taxrate) {
		Product.taxrate = taxrate;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public double getSellingPrice() {
		return this.price + this.price * Product.taxrate / 100;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
