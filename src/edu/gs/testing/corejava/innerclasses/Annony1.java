package edu.gs.testing.corejava.innerclasses;

interface Flyable {

	public void fly();

}

interface MarkerInterface {

}

class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("plane is flying");
	}

}

public class Annony1 {
	public static void main(String[] args) {

		Flyable flyable = new Plane();
		flyable.fly();

		Flyable flyable2 = new Flyable() {

			@Override
			public void fly() {
				System.out.println("my annoy class");
			}
			
			public void m1() {
				
			}

		};

		flyable2.fly();

		MarkerInterface marker = new MarkerInterface() {

		};
		MarkerInterface marker1 = new MarkerInterface() {

		};
		System.out.println(marker);
		System.out.println(marker1);

		Runnable runnable = new Runnable() {

			@Override
			public void run() {

			}
		};

	}
}
