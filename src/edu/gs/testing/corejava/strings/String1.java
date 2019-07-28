package edu.gs.testing.corejava.strings;

import java.util.Arrays;

public class String1 {
	public static void main(String[] args) {
		String name = "MohitoHhiNM";
		String name1 = new String("Mohit");// {m,o,h,i,t}
		if (name.equals(name1)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		char charAt3 = name.charAt(3);
		System.out.println("char at 3 is " + charAt3);

		int in1 = name.indexOf("hi", 3);

		System.out.println("index of o is " + in1);

		name.length();

		char[] name2 = name.toCharArray();

		String s1 = "Cat"; // Pool : s1
		String s2 = "Cat"; // s1 : s1

		System.out.println("s1 ka ref " + s1.hashCode());
		System.out.println("s2 ka ref " + s2.hashCode());

		if (s1 == s2) {
			System.out.println("same");
		} else {
			System.out.println("Not same");
		}

		// String name = "MohitoHhiNM";

		name = name.replace('M', 'N'); //
		System.out.println(name);

		name = name.substring(2, 5);
		System.out.println(name); // endindex-1

		String lANme = "MAlhotra";
		name = name + lANme;
		System.out.println(name);

		System.out.println(name.toUpperCase());

		String names = "mohit,neeti,sumit,amit";
		String[] namesArray = names.split(",");
		System.out.println(Arrays.toString(namesArray));
		String username = "  MOmalhotra ".trim();
		System.out.println("name is" + username + "end");

		if (lANme.startsWith("M")) {
			System.out.println("yes ");
		} else {
			System.out.println("no");
		}

	}

}
