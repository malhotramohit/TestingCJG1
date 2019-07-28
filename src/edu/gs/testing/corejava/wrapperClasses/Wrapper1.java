package edu.gs.testing.corejava.wrapperClasses;

enum Levels {
	Respondent, Magager, Ditrector
}

public class Wrapper1 {
	public static void main(String[] args) {

		// way1 using cons
		Integer num1 = new Integer(23);
		System.out.println(num1);

		Integer num2 = new Integer(24); // int

		// way 2
		Integer num3 = 78; // primitve : autoboxing

		// way 3 by calling static function
		Integer num4 = Integer.valueOf(89);

		System.out.println("sum is " + num1 + num2);
		System.out.println(num1 + num2 + "sum is ");

		System.out.println("---problem--");
		Integer i = new Integer(12);
		Integer j = new Integer(12);
		if (i == j) {
			System.out.println("Same");
		} else {
			System.out.println("diff");
		}

		Long l = new Long(454355);

		Character character = Character.valueOf('A');

		///
		int pnum1 = num1; // unboxing wrapper -> primitive

		//
		String patStr = "123";
		Integer patId = Integer.parseInt(patStr);
		// Integer.parseInt(patStr);

		System.out.println("num is plus " + patId);

		Levels mLevel = Levels.Magager;
		if (Levels.Magager == mLevel) {
			System.out.println(mLevel.ordinal());
		}

	}

}
