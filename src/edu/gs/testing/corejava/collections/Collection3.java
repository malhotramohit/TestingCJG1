package edu.gs.testing.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class Collection3 {

	public static void main(String[] args) {
		List<Integer> number1List = new ArrayList<Integer>();

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			number1List.add(i);
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Time for add in arrayList : " + String.valueOf(endTime - startTime));

	}

}
