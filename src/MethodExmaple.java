
public class MethodExmaple {

	static void printSomething() {
		System.out.println("TEsting");
	}

	int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		printSomething();

		MethodExmaple exmaple = new MethodExmaple();
		int res = exmaple.add(23, 45);
		System.out.println(res);
	}

}
