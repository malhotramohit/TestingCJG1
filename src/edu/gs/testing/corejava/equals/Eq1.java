package edu.gs.testing.corejava.equals;

import edu.gs.testing.corejava.constructors.Wallet;

class Pen {
	private int id;
	private double price;

	public Pen(int id, double price) {
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	/*
	 * public boolean equals(Object obj) { // 1) id and price same ho
	 * 
	 * boolean isSame = false; Pen penObj = (Pen) obj; if (this.id == penObj.id &&
	 * this.price == penObj.price) { isSame = true; }
	 * 
	 * return isSame; }
	 */
}

public class Eq1 {
	public static void main(String[] args) {
		Pen pen1 = new Pen(1, 34.5);
		Pen pen2 = new Pen(1, 34.5);

		if (pen1.equals(new Wallet())) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

	}
}
