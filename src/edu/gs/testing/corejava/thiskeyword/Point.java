package edu.gs.testing.corejava.thiskeyword;

public class Point {

	public int x;
	private int y;
	private int z;

	void setZ(int z) {
		this.z = z;
	}

	public Point(int x, int y) {
		this.x = x; // 12 =12
		this.y = y;
	}

	public static void main(String[] args) {
		Point point = new Point(12, 14);
		point.setZ(15);
		System.out.println(point.x);
		System.out.println(point.y);
		System.out.println(point.z);

	}

}
