package com.nsf.gaffu.ipulse.membership.test;

class Account {
	private long accNo;
	private String type;

	public Account(long accNoP, String typeP) {
		accNo = accNoP;
		type = typeP;
	}

	public long getAccNo() {
		return accNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "Account [ accNo = " + accNo + ", type = " + type + "]";
	}

}

public class Bank {

	public static void main(String[] args) {
		Account account = new Account(345353, "Savingd");

		System.out.println(account);

	}

}
