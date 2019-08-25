package edu.gs.testing.corejava.collections;

import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

class Charger {
	private int id;
	private double price;
	private String color;

	public Charger(int id, double price, String color) {
		this.id = id;
		this.price = price;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Charger [id=" + id + ", price=" + price + ", color=" + color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Charger other = (Charger) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

}

class CharagerIDComparator implements Comparator<Charger> {

	@Override
	public int compare(Charger o1, Charger o2) {

		return o1.getId() - o2.getId();
	}

}

class CharagePriceComparator implements Comparator<Charger> {

	@Override
	public int compare(Charger o1, Charger o2) {

		return (int) (o1.getPrice() - o2.getPrice());
	}

}

public class Collection5 {

	public static void main(String[] args) {

		Charger charger1 = new Charger(11, 3343.434, "red");
		Charger charger2 = new Charger(12, 3445454.434, "blavk");
		Charger charger3 = new Charger(9, 565.434, "zlue");
		Charger charger4 = new Charger(9, 565.434, "white");
		Charger charger5 = new Charger(23, 8787.434, "greeen");

		List<Charger> chargers = new ArrayList<Charger>();

		chargers.add(charger1);
		chargers.add(charger2);
		chargers.add(charger3);
		chargers.add(charger4);
		chargers.add(charger5);

		// Sort ?

		System.out.println("before sorting");
		System.out.println(chargers);

		// Collections.sort(chargers,(o1,o2)->{
		// return o1.getId()-o2.getId();
		// });

		Collections.sort(chargers,
				Comparator.comparing(Charger::getId).thenComparing(Charger::getPrice).thenComparing(Charger::getColor));

		System.out.println("after sorting");
		System.out.println(chargers);

		System.out.println("set of chargers");

		Set<Charger> chargerSet = new HashSet<Charger>();
		chargerSet.add(charger1);
		chargerSet.add(charger2);
		chargerSet.add(charger3);
		chargerSet.add(charger4);
		chargerSet.add(charger5);

		Charger charger44 = new Charger(9, 565.434, "white");
		chargerSet.add(charger44);
		System.out.println(chargerSet);

	}

}
