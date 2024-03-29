package edu.gs.testing.corejava.ntupractice;

class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int percent) {
		return ((salary * percent) / 100) + salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + "]";
	}

}

public class TestEmployeee {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Mohit", "Malhotra", 54355546);

		System.out.println(employee);

		employee.setSalary(1000);

		System.out.println(employee.getAnnualSalary());

		int incrementedSalary = employee.raiseSalary(10);

		System.out.println(incrementedSalary);
	}

}
