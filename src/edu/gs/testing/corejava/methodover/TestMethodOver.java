package edu.gs.testing.corejava.methodover;

class Parent {
	protected void doMarriage() {
		System.out.println("Do mar by pars choice");
	}
}

class Child extends Parent {
	public void doMarriage() {
		System.out.println("Do mar by child choice");
	}
}

public class TestMethodOver {

	public static void main(String[] args) {

		final int i = 90;

		Child child = new Child();
		child.doMarriage();
	}

}
