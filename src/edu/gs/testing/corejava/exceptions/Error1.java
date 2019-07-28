package edu.gs.testing.corejava.exceptions;

public class Error1 {
	public static void main(String[] args) {

		System.out.println("Before error");
		try {
			m1();
		} catch (StackOverflowError error) {
			error.printStackTrace();
		}
		System.out.println("------After error-------");
		m2();
	}

	private static void m2() {
		System.out.println("------M-----");
	}

	static void m1() {
		m1();
	}
}
