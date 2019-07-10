package edu.gs.testing.corejava.arrays;

import java.util.Arrays;
import java.util.Random;

// 1000: a =5
//  0   1    2     3
// 1000 1004 1008 1012

public class TestArray {

	public static void main(String[] args) {

		// myFirstArrayMethod();
		int[] array = prepareAscArrayOfSize(10000, 100);

		// prepareRandomArrayOfSize(10000, 100);

		// System.out.println("Array ");
		// System.out.println(Arrays.toString(array));
		// int max = modifiedFindMax(array);
		// // findMax(array);
		// System.out.println("max is " + max);
		// System.out.println("Array after modi max");
		// System.out.println(Arrays.toString(array));

		long start = System.currentTimeMillis();
		bubbleSort(array);
		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Time taken " + diff);
		// System.out.println("array after sorting " + Arrays.toString(array));

	}

	private static int[] prepareAscArrayOfSize(int size, int limit) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}

	private static void bubbleSort(int[] array) {
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - j - 1; i++) {
				if (array[i + 1] < array[i]) {
					// swap
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

	}

	private static void modifiedBubbleSort(int[] array) {
		boolean isSwapped = false;
		for (int j = 0; j < array.length; j++) {
			isSwapped = false;
			for (int i = 0; i < array.length - j - 1; i++) {
				if (array[i + 1] < array[i]) {
					// swap
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

					isSwapped = true;
				}
			}
			if (!isSwapped) {
				break;
			}
		}

	}

	/**
	 * This method will return the max element
	 * 
	 * @param array
	 * @return
	 */
	private static int findMax(int[] array) {
		// i/p : [5, 8, 11, 0, 6, 23, 1, 10]
		// o/p : 23
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * This method will return the max element
	 * 
	 * @param array
	 * @return
	 */
	private static int modifiedFindMax(int[] array) {
		// i/p : [5, 8, 0,6, 11, 1, 10, 23]
		// o/p : 23
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] < array[i]) {
				// swap
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
		return array[array.length - 1];
	}

	private static int[] prepareRandomArrayOfSize(int size, int limit) {
		int[] arra = new int[size];
		Random random = new Random();
		for (int i = 0; i < arra.length; i++) {
			arra[i] = random.nextInt(limit);
		}

		return arra;
	}

	private static void myFirstArrayMethod() {
		int a = 2;

		int[] arr = { 1, 2, 3, 4 };

		System.out.println(arr[0]);

		int size = arr.length;
		System.out.println("size is " + size);

		System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println(Arrays.toString(arr));

		// way 2
		int[] arr1 = new int[8];

		Random random = new Random();

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = random.nextInt(25);
		}
		System.out.println(Arrays.toString(arr1));

	}

}
