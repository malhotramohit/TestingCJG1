package edu.gs.testing.corejava.equals;

class Wheel {

}

class Tyre extends Wheel {
	private int id;
	private double size;
	private double price;
	private String brandName;

	public Tyre(int id, double size, double price, String brandName) {
		this.id = id;
		this.size = size;
		this.price = price;
		this.brandName = brandName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isSame = false;
		if (obj instanceof Tyre) {
			Tyre tyreOb = (Tyre) obj;
			if (this.id == tyreOb.id && this.price == tyreOb.price && this.size == tyreOb.size
					&& this.brandName.equals(tyreOb.getBrandName())) {
				isSame = true;
			}
		}
		return isSame;
	}

}

public class Equals2 {

	public static void main(String[] args) {

		Tyre tyre1 = new Tyre(1, 23.33, 4555.44, "MRF");
		Tyre tyre2 = new Tyre(1, 23.33, 4555.44, "MRF");
		Tyre tyre3 = new Tyre(1, 23.33, 4555.44, "MRF");

		System.out.println("hashcode of tyre1 " + tyre1.hashCode());
		System.out.println("hashcode of tyre2 " + tyre2.hashCode());
		System.out.println("hashcode of tyre3 " + tyre3.hashCode());

		Pen pen = new Pen(1, 3434);

		// == : reference : hashcode
		if (tyre1.equals(pen)) {
			System.out.println("they are same");
		} else {
			System.out.println("they are not same");
		}

		if (tyre1 instanceof Wheel) {
			System.out.println(" tyre1 instanceof Wheel ");
		} else {
			System.out.println(" tyre1 is not instanceof Wheel ");

		}

		Wheel wheel = new Wheel();

		if (wheel instanceof Tyre) {
			System.out.println(" wheel instanceof Tyre ");
		} else {
			System.out.println(" wheel is not instanceof Tyre ");

		}

	}

}
