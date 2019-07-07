package edu.gs.testing.corejava.constructors;

import edu.gs.testing.corejava.util.MyUtility;

public class Wallet {

	int walletId;
	String walletName;
	int size;
	
	static {
		System.out.println("I am static block 1");
	}

	// Wallet(){
	//
	// }

	int Wallet() {
		System.out.println("I am no-args / default cons");
		return 0;
	}

	// Wallet() {
	// System.out.println("I am no-args / default cons");
	// }

	Wallet(int id, String name) {
		System.out.println("id string cons");
		walletId = id;
		walletName = name;
	}

	// Wallet(String name, int id) {
	// System.out.println(" string id cons");
	//
	// walletId = id;
	// walletName = name;
	// }

	static int comparTo(Wallet wallet1, Wallet wallet2) {
		if (wallet1.size > wallet2.size) {
			return 1;
		} else if (wallet1.size == wallet2.size) {
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Wallet wallet1 = new Wallet(1, "wallet id");
		// Wallet wallet1 = new Wallet( "wallet2",3);
		wallet1.size = 90;
		Wallet wallet2 = new Wallet(1, "wallet id");
		wallet2.size = 99;

		int res = Wallet.comparTo(wallet1, wallet2);
		if (res == 1) {
			System.out.println("wallet1 > wallet2");
		} else if (res == 0) {
			System.out.println("wallet1 = wallet2");

		} else {
			System.out.println("wallet1 < wallet2");

		}

		if (MyUtility.isEven(wallet1.size)) {
			System.out.println("size is even");
		} else {
			System.out.println("size is odd");
		}

	}
	
	static {
		System.out.println("I am static block 2");
	}

}
