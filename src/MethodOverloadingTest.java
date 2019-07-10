
public class MethodOverloadingTest {

	public static void main(String[] args) {

		int res1 = add(4, 5);
		int res4 = add(4, 'a');
		int res5 = add('b', 9, 90);

		int res2 = add(4, 5, 6);
		int res3 = add(4, 5, 6, 7);

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, char b) {
		return a + b;
	}

	public static int add(char a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}
