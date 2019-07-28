package edu.gs.testing.corejava.exceptions;

class Doctor {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class MultipleReturn {

	Doctor getDoc() {
		Doctor doc = new Doctor();
		doc.setName("Mohit");

		try {
			String[] students = { "Harry", "Paul" };
			System.out.println(students[5]);
		} catch (Exception e) {
			doc.setName("Mohit1");
			System.out.println("catch -->" + doc.getName());
			return doc;
		} finally {
			doc.setName("Mohit2");
			System.out.println("finally -->" + doc.getName());
		}

		return doc;

	}
}

public class TestMultipleReturn {
	public static void main(String[] args) {
		MultipleReturn var = new MultipleReturn();
		System.out.println("Ret val :" + var.getDoc().getName());
	}
}