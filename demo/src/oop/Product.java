package oop;

public class Product {
	private String name;
	private double price;

	public Product(String n, double p) {
		name = n;
		price = p;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getSellingPrice() {
		return price * 1.05;
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}

}
