
public class Calculator {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, char b) {
		System.out.println("first int then char");
		return a + b;
	}

	int add(char a, int b) {
		System.out.println("first char then int");
		return a + b;
	}
	//
	// float add(int a, int b) {
	// return 34.343f;
	// }

	int add(int a, int b, int c) {
		return a + b + c;
	}

	int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		int res1 = calculator.add(23, 34);
		int res2 = calculator.add(23, 34, 43);
		int res3 = calculator.add(23, 34, 445, 45);
		
		calculator.add('a', 3);
		calculator.add(3, 'b');

	}

}
