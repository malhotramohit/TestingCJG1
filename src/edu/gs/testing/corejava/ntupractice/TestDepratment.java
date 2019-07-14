package edu.gs.testing.corejava.ntupractice;

public class TestDepratment {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "abc", "def", 445435);
		Department dept1 = new Department(2, "IT dept", emp1);

		System.out.println(dept1);

	}

}
