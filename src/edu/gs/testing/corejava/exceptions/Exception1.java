package edu.gs.testing.corejava.exceptions;

public class Exception1 {

	public static void main(String[] args) {

		System.out.println("before exception");

		try {

			Object obj = null;

			obj.toString();

			int[] arr = { 1, 2, 90, 89 };

			System.out.println(arr[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsExc handled");
		} catch (RuntimeException e1) {
			System.out.println("Null handled");
		} finally {
			System.out.println("I will always execute");
		}
		System.out.println("after ArrayIndexOutOfBoundsExceptionKKKK ");

		// try catch finally throw throws

		System.out.println("After exception");

	}
}
