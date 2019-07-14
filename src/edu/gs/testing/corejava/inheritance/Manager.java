package edu.gs.testing.corejava.inheritance;

public class Manager extends Employeee {

	int id = 900;

	private int teamSize;

	public void checkId() {
		System.out.println("id in manager is " + id);
		System.out.println("id in emp is " + super.id);

	}

	public Manager(int teamSize, int id, String name, String emailId) {
		super(id, name, emailId);
		// super();
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

	@Override
	public String toString() {
		return "Manager [id=" + id + ", teamSize=" + teamSize + ", name=" + name + ", emaildId=" + emaildId + "]";
	}



}
