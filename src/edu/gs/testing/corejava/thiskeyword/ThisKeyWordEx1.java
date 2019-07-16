package edu.gs.testing.corejava.thiskeyword;

class Wallet {

	private int id; // instance
	private String name;

	Wallet(int id) {
		this(23, null);
	}

	Wallet(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		String name = "test"; // data hiding
		this.id = id; // id =0 , id =90
		System.out.println("local name is " + name);
		System.out.println("instnace's name is " + this.name);
		this.print();
	}

	public void print() {
		System.out.println("testing print");
	}

	public int getId() {
		return id;
	}
}

public class ThisKeyWordEx1 {

	public static void main(String[] args) {

		Wallet wallet1 = new Wallet(23);

		wallet1.setId(90);
		System.out.println(wallet1.getId());

		Wallet wallet2 = new Wallet(445);

		wallet2.setId(90);
		System.out.println(wallet2.getId());

	}

}
