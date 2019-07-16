package edu.gs.testing.corejava.inheritance;

public class Employeee {

	protected int id = 90;
	private String name;
	private String emaildId;

	// public Employeee() {
	//
	// }

	public Employeee(int id, String name, String emaildId) {
		System.out.println("Inside emp cons");

		this.id = id;
		this.name = name;
		this.emaildId = emaildId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmaildId() {
		return emaildId;
	}

	public void setEmaildId(String emaildId) {
		this.emaildId = emaildId;
	}

	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", emaildId=" + emaildId + "]";
	}

}
