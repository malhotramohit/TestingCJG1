
public class ForLoopTest {

	public static void main(String args[]) {
		// *
		// *
		// *
		// *
		// *

		// for, while, do-while
		// i =0;
		// *
		// i=1
		// *
		// i=2
		// *
		// i=3
		// *
		// i=4
		// *
		// i =5

		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// *****
		// *****
		// *****
		// *****
		// *****

		// for (;;) {
		// System.out.println("test");
		// }

		//

		// entry check
		// int j = 10;
		// while (true) {
		// System.out.println("j is " + j);
		// j--;
		// }
		// do while
		// exit check
		int menu = 1;
		do {
			System.out.println("Menu item is " + menu);
			menu++;

		} while (menu < 5);

		int e = 0;
		do {
			int t = 0;
			do {
				System.out.print("*");
				t++;
			} while (t < 5);
			System.out.println();
			e++;

		} while (e < 5);
		
		
		// 121
		// 121
		// 1331
		// 0 1 1 2 3 5 8 13
		// f(6)  =5

	}

}
