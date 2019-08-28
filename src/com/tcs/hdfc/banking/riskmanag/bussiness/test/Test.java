package com.tcs.hdfc.banking.riskmanag.bussiness.test;

public class Test {
	public static void main(String[] args) {
		int result = 0;
		result = add(2, 3);
		System.out.println(" : res is -> " + result);
		result = add(2, 3, 5);
		System.out.println(" : res is -> " + result);
		result = add(2, 'a'); // ascii of a = 97
		System.out.println(" : res is -> " + result);
		result = add();
		System.out.println(" : res is -> " + result);
		result = add(2, 3, 4, 5);
		System.out.println(" : res is -> " + result);
	}

	public static int add(int a, int b) {
		System.out.print(" Called add(int a, int b) ");
		return a + b;
	}

	public static int add(int a, int b, int c) {
		System.out.print(" Called add(int a, int b, int c) ");
		return a + b + c;
	}

	public static int add(int a, char b) {
		System.out.print(" Called add(int a, char b) ");
		return a + b;

	}

	public static int add(int... a) {
		System.out.print(" Called add(int... a) ");
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
