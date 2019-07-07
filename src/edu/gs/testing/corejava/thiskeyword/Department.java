package edu.gs.testing.corejava.thiskeyword;

public class Department {
	private long deptID;
	private String deptName;
	
	public Department(long deptID, String deptName) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
	}

	public long getDeptID() {
		return deptID;
	}

	public void setDeptID(long deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + "]";
	}
	
	

	
	
	

}
