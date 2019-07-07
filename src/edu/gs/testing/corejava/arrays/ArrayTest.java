package edu.gs.testing.corejava.arrays;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {

		// way 1: declare as well as initializing
		int[] prodArray = { 12, 34, 56, 89, 5, 5, 6, 7, 4, 5, 3, 5, 3, 4, 3, 190, 45, 54, 55, 6 };

		System.out.println(prodArray[0]);
		System.out.println(prodArray[1]);

		System.out.println("Len is " + prodArray.length);

		// way 2:
		double[] salaryArray = new double[3];

		salaryArray[0] = 234324.4;
		salaryArray[1] = 3.3434;

		System.out.println(salaryArray[0]);
		System.out.println(salaryArray[1]);

		// for(int i =0;i<prodArray.length;i++) {
		// System.out.print(prodArray[i]);
		// }

		System.out.println(Arrays.toString(prodArray));

		int num = 5; // 3, Present
						// -1 , NP
		boolean isPresent = false;
		for (int i = 0; i < prodArray.length; i++) {
			if (prodArray[i] == num) {
				isPresent = true;
				System.out.println(i + " Present");
				break;
			}
		}
		if (!isPresent) {
			System.out.println("Not Present");

		}

		int max = modfindMax(prodArray);
		System.out.println("Max is " + max);
		System.out.println("Array after max");
		System.out.println(Arrays.toString(prodArray));
		System.out.println("After sorting");
		bubbleSort(prodArray);
		System.out.println(Arrays.toString(prodArray));

	}

	private static int modfindMax(int[] prodArray) {
		// { 12, 34, 56, 5, 5, 5, 6, 89};
		// 0 1 2 3 4 5 6
		//
		// 89

		int max = prodArray[0];
		for (int i = 1; i < prodArray.length; i++) {
			if (prodArray[i] > max) {
				max = prodArray[i];
			}
		}

		return max;
	}

	private static void bubbleSort(int[] prodArray) {
		for (int j = 0; j < prodArray.length; j++) {
			for (int i = 0; i < prodArray.length - 1; i++) {
				if (prodArray[i] < prodArray[i + 1]) {
					int temp = prodArray[i];
					prodArray[i] = prodArray[i + 1];
					prodArray[i + 1] = temp;
				}
			}
		}
	}

	private static int findMax(int[] prodArray) {
		// { 12, 34, 56, 5, 5, 5, 6, 89};
		// 0 1 2 3 4 5 6
		//
		// 89
		for (int i = 0; i < prodArray.length - 1; i++) {
			if (prodArray[i] > prodArray[i + 1]) {
				int temp = prodArray[i];
				prodArray[i] = prodArray[i + 1];
				prodArray[i + 1] = temp;
			}
		}
		return prodArray[prodArray.length - 1];
	}
}
