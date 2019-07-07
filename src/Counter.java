
public class Counter {

	 int count = 0;// class variable

	void increment() {
		count++;
		System.out.println("count is " + count);
	}

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();

		counter1.increment();
		counter2.increment();
		counter3.increment();

	}

}
