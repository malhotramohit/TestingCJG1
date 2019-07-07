import java.util.Scanner;

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

		int num = 0;
		System.out.println("Enter the num");
		Scanner input =  new Scanner(System.in);	
		num = input.nextInt();
		
		
		
		int res = fact(num);
		System.out.println(res);
		
		
		 Scanner myObj = new Scanner(System.in);

		    System.out.println("Enter name, age and salary");

		    // String input
		    String name = myObj.nextLine();

		    // Numerical input
		    int age = myObj.nextInt();
		    double salary = myObj.nextDouble();

		    // Output input by user
		    System.out.println("Name: " + name); 
		    System.out.println("Age: " + age); 
		    System.out.println("Salary: " + salary); 
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
