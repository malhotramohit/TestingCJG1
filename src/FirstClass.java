
public class FirstClass {

	public static void main(String[] args) {
		System.out.println("Hello, World");

		byte b = 127; // 128 64 32 16 8 4 2 1
						// 0 1 1 1 1 1 1 1
						// 1 0 0 0 0 0 0 0
		short s = 3434;// 2bytes
		int i = 556546; // 4bytes
		long num = 3353656546L; // 8 bytes

		float yearOfExp = 656.7676f;
		double distance = 464646464.67657657657;

		char gender = 'M';

		boolean flag = false;

		int inter = 0x00A; // 8
		// inter = 0011 // 9
		// inter = 013 //11
		System.out.println(inter);

		System.out.println(inter);

		int num1 = -129;
		byte b1 = (byte) num1;
		System.out.println(b1);
		// 265 128 64 32 16 8 4 2 1
		// 0 1 0 0 0 0 0 0 1
		// 1 0 1 1 1 1 1 1 0 // 1's complement
		// + 1
		// 1 0 1 1 1 1 1 1 1 // - 129

		int num2 = -16;
		num2=num2+8;
		
		byte b2 = (byte) num2;
		System.out.println(b2);
		
		
	}

}
