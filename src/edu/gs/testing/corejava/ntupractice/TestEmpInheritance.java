package edu.gs.testing.corejava.ntupractice;

import edu.gs.testing.corejava.inheritance.Employeee;
import edu.gs.testing.corejava.inheritance.Manager;

public class TestEmpInheritance {
	public static void main(String[] args) {
		Manager manager = new Manager(23, 1, "cdff.com", "mohit");
		manager.checkId();

		System.out.println(manager);

		Employeee employeee = new Employeee(1, "name2", "dffd.com");

		// employeee.
	}

}
