package edu.gs.testing.corejava.oops;

public class TestCircle {
	public static void main(String[] args) {

		// No args cons
		Circle circle1 = new Circle();

		System.out.println(circle1.getRadius());
		System.out.println(circle1.getArea());

		Circle circle2 = new Circle(12.898587);

		System.out.println(circle2.getRadius());
		System.out.println(circle2.getArea());
		
		Circle circle3 = new Circle(12.898587,"black");
		System.out.println(circle3);
		
		

	}
}
