package com.nsf.gaffu.ipulse.membership.test;

public class CounterTest {

	static int count = 0;

	void increment() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		CounterTest counterTest1 = new CounterTest();
		CounterTest counterTest2 = new CounterTest();
		CounterTest counterTest3 = new CounterTest();
		counterTest1.increment();
		counterTest2.increment();
		counterTest3.increment();

	}

}
