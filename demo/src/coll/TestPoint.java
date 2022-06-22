package coll;

import java.util.TreeSet;

class OnePoint implements Comparable<OnePoint> {
	private int x, y;

	public OnePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	public boolean equals(Object obj) {
		var other = (OnePoint) obj;
		return this.x == other.x && this.y == other.y;
	}

	public int hashCode() {
		return x;
	}

	@Override
	public int compareTo(OnePoint other) {
		 return  (this.x * this.y) - (other.x * other.y);
	}
}

public class TestPoint {

	public static void main(String[] args) {
		var lhs = new TreeSet<OnePoint>();

		lhs.add(new OnePoint(10, 20));
		lhs.add(new OnePoint(10, 10));
		lhs.add(new OnePoint(10, 25));
		lhs.add(new OnePoint(1, 2));

		for (var p : lhs) {
			System.out.println(p);
			System.out.println(p.hashCode());
		}
	}

}
