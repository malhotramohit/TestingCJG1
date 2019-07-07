package edu.gs.testing.corejava.thiskeyword;

public class TestDepartment {
	
	public static void main(String[] args) {
		Department department =  new Department(12,"IT");
//		department.setDeptID(12);
//		department.setDeptName("IT");
//		System.out.println(department.getDeptID());
//		System.out.println(department.getDeptName());
		System.out.println(department.toString());
		
		Department department1 =  new Department(13,"CSE");
		System.out.println(department1.toString());



	}

}
