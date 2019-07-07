
public class MethodExmaple {

	static void m1(RuntimeException um) {

		System.out.println("Exception m1");
	}

	static void m1(NullPointerException num) {
		System.out.println("NullPointerException m1");

	}

	static void printSomething() {
		System.out.println("TEsting");
	}

	int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		m1(null);

		printSomething();

		MethodExmaple exmaple = new MethodExmaple();
		int res = exmaple.add(23, 45);
		System.out.println(res);
	}

}
