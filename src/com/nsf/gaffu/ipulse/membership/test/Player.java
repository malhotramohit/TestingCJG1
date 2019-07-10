package com.nsf.gaffu.ipulse.membership.test;

public class Player {

	static String country = "India"; // class level var

	int age; // instance variables
	String name;
	int numOfMatchesPlayed;
	String type;

	Player(int ageParam, String nameParam) {
		System.out.println("I am in 2 args cons");
		age = ageParam;
		name = nameParam;
	}

	Player(int ageParam, String nameParam, String typeParam) {
		age = ageParam;
		name = nameParam;
		type = typeParam;
	}

	void play() {
		System.out.println("Playing cricket ");
	}

	void makeCentury() {
		System.out.println("make 100");
	}

	public static void main(String[] args) {
		Player player1 = new Player(25, "Virat");

		player1.age = 27;
		player1.name = "Dhoni";
		System.out.println(player1.age);
		System.out.println(player1.name);
		System.out.println(Player.country);

		player1.country = "Bharat";

		Player player2 = new Player(67, "agjh");
		int age = 45; // local

		player2.age = age;
		player2.name = "Rahull";
		System.out.println(player2.age);
		System.out.println(player2.name);
		System.out.println(Player.country);

	}

}
