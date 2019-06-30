// fact(5) = 5*4*3*2*1
// fact(5) = 5*fact(4)
// fact(4) = 4* fact(3)
// fact(3) = 3* fact(2)
// fact(2) = 2* fact(1)
//fact(1) =1

public class Recurssion {

	static int i = 0;

	public static void main(String[] args) {
		m1();
		int res = fact(5);
		System.out.println(res);
	}

	static void m1() {
		i++;
		System.out.println("m1 " + i);
		while (i < 5) {
			m1();
		}
	}

	static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
}
