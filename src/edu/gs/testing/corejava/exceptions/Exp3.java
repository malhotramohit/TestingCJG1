package edu.gs.testing.corejava.exceptions;

public class Exp3 {

	public static void main(String[] args) {
		int i = 90;
		if (i < 100) {
			throw new Exception("Number cannot be less than 100");
		}
	}

}
