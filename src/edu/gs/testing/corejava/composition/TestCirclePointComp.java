package edu.gs.testing.corejava.composition;

import java.util.Arrays;

public class TestCirclePointComp {
	public static void main(String[] args) {
		MyPoint myPoint1 = new MyPoint(2, 5);

		System.out.println(myPoint1);

		myPoint1.setXY(4, 3);
		System.out.println(myPoint1);

		int[] xyArr = myPoint1.getXY();
		System.out.println(Arrays.toString(xyArr));

		System.out.println(myPoint1.distance());

		MyPoint myPoint2 = new MyPoint(11, 12);

		System.out.println(myPoint1.distance(myPoint2));
		System.out.println(myPoint1.distance(6, 8));

		MyCircle circle1 = new MyCircle(myPoint1, 2);
		MyCircle circle2 = new MyCircle(6, 8, 5);

		System.out.println(circle1);
		System.out.println(circle2.getArea());

		System.out.println(circle1.distance(circle2));
	}

}
