package edu.gs.testing.corejava.equals;

import java.util.Date;

class Festival {
	private String name;
	private Date date;

	public Festival(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean equals(Object obj) {
		boolean isSame = false;
		Festival festival = (Festival) obj;
		if (this.name.equals(festival.getName()) && this.date.equals(festival.date)) {
			isSame = true;
		}
		return isSame;
	}
}

public class Equals3 {

	public static void main(String[] args) {
		// testing
		// two objects with same internal values will ne
		// same or not ?

		Date date1 = new Date();
		System.out.println(date1);
		Festival festival1 = new Festival("Holi", date1);
		Festival festival2 = new Festival("Holi", date1);

		if (festival1.equals(festival2)) {
			System.out.println("they are same");
		} else {
			System.out.println("they are not same");
		}

	}

}
