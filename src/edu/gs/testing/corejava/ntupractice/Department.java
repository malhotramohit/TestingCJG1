package edu.gs.testing.corejava.ntupractice;

public class Department {

	private int deptId;
	private String name;

	// has emp
	private Employee employee;

	public Department(int deptId, String name, Employee employee) {
		this.deptId = deptId;
		this.name = name;
		this.employee = employee;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + ", employee=" + employee + "]";
	}

}
