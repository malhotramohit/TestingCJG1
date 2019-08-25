package edu.gs.testing.corejava.innerclasses;

@FunctionalInterface
interface Walkable {

	public void walk(int speed);

	// Object class
	public String toString();

	// default methods
}

interface Calculator {

	public int add(int a, int b);

}

public class FunctionInterface1 {

	public static void main(String[] args) {
		// Walkable walkable = new Walkable() {
		//
		// @Override
		// public void walk() {
		// System.out.println("Walking --");
		// }
		// };
		//
		// walkable.walk();

		Walkable walkable2 = (speed) -> {
			System.out.println("Lamda walking " + speed);
		};

		walkable2.walk(23);

		Calculator calculator = (param1, param2) -> {
			return param1 + param2;
		};

		System.out.println(calculator.add(23, 34));

		Thread th1 = new Thread(() -> {
			System.out.println("run method of thread");
		});

		th1.start();

	}

}
