package edu.gs.testing.corejava.methodover;

class Parent {
	protected Exception doMarriage() {
		System.out.println("Do mar by pars choice");
		return null;
	}
}

class Child extends Parent {

	public ArrayIndexOutOfBoundsException doMarriage() {
		System.out.println("Do mar by childs choice");
		return null;
	}

	public void doMarriage(Exception obj) {
		System.out.println("Do mar by child choice  obj wala");
	}

	public void doMarriage(ArrayIndexOutOfBoundsException str) {
		System.out.println("Do mar by child choice  str wala");

	}
}

public class TestMethodOver {

	public static void main(String[] args) {

		Child child = new Child();
		child.doMarriage(null);
		child.doMarriage();

	}

}
