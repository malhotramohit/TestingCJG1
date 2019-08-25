package edu.gs.testing.corejava.innerclasses;

interface Drinkable {
	public void drink();
}

public class MethodRef1 {

	MethodRef1() {
		System.out.println("default con ");
	}

	public void m1() {
		System.out.println("m1 of methodref1");
	}

	public void m2() {
		System.out.println("m2 of methodref2");
	}

	public static void m3() {
		System.out.println("m3 of methodref3");
	}

	public static void main(String[] args) {

		// MethodRef1 methodRef1 = new MethodRef1();
		// methodRef1.m1();
		// methodRef1.m2();

		Drinkable drinkable = MethodRef1::m3;
		drinkable.drink();

		Drinkable drinkable2 = MethodRef1::new;
		drinkable2.drink();

	}

}
