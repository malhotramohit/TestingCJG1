package edu.gs.testing.corejava.collections;

import java.util.LinkedList;

public class Collection4 {
	public static void main(String[] args) {

		//
		LinkedList<String> browserHistory = new LinkedList<>();

		browserHistory.push("www.google.com");
		browserHistory.push("www.google.com/java");
		browserHistory.push("www.google.com/javatpoint");
		browserHistory.push("www.google.com/javatpoint/stack");

		System.out.println(browserHistory.pop());

		System.out.println(browserHistory);
		

	}

}
