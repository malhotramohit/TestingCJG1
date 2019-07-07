
public class Employee {

	int empId; // instance variable
	String name;
	char gender;
	static String companyName = "TCS"; // class level variable

	public static void main(String[] args) {
		// classname emp1 = new classname();
		Employee emp1 = new Employee();

		emp1.empId = 1;
		emp1.name = "Mohit";
		emp1.gender = 'M';

		System.out.println(emp1.empId);
		System.out.println(emp1.name);
		System.out.println(emp1.gender);
		System.out.println(emp1.companyName);
		
		emp1.companyName = "HCL";

		Employee emp2 = new Employee();

		emp2.empId = 2;
		emp2.name = "Rohit";
		emp2.gender = 'M';

		// emp2 = emp1;

		System.out.println(emp2.empId);
		System.out.println(emp2.name);
		System.out.println(emp2.gender);
		System.out.println(emp2.companyName);

		int i = 0; // local var

		
		System.out.println("com name is "+Employee.companyName);
	}

}
