package edu.gs.testing.corejava.inheritance;

public class Manager extends Employeee {

	int id = 900;

	private int teamSize;

	public void checkId() {
		System.out.println("id in manager is " + id);
		System.out.println("id in emp is " + super.id);

	}

	public Manager(int id, String name, String emailId, int teamSize) {
		super(id, name, emailId);
		// super();
		System.out.println("Inside man cons");
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public void manageTeam() {

	}

}
