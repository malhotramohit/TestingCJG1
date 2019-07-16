package edu.gs.testing.corejava.composition;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint() {
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		int[] arr = { x, y };
		return arr;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public double distance(int x2, int y2) {
		// x2 y2 x1 y1
		int x1 = this.x;
		int y1 = this.y;

		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

	}

	public double distance(MyPoint another) {
		return distance(another.x,another.y);
	}
	
	public double distance() {
		return distance(0,0);
	}

}
