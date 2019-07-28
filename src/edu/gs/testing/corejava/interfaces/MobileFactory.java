package edu.gs.testing.corejava.interfaces;

interface Android {

	int salary = 535;

	public void installPlayStore(); // public

	public void preInstalledAnroidApp();
}

interface Windows {
	public void installMSOffice();
}

class Mobile implements Android, Windows {
	private int id;
	private String name;

	@Override
	public void installPlayStore() {
		System.out.println("Andrpod installed");
	}

	@Override
	public void installMSOffice() {
		System.out.println("Ms office installed");
	}

	@Override
	public void preInstalledAnroidApp() {
		System.out.println("preInstalledAnroidApp");

	}

}

class NokiaMobile implements Android {

	@Override
	public void installPlayStore() {
		System.out.println("Andrpod installed on nokia");
	}

	@Override
	public void preInstalledAnroidApp() {
		System.out.println("preInstalledAnroidApp on nokia");

	}
}

public class MobileFactory {
	public static void main(String[] args) {

		Android android = new Mobile();

		// Mobile mob = (Mobile) android;
		// mob.installMSOffice();

		//
		//android = new NokiaMobile();

		checkPhonePerformannece(android);

	}

	private static void checkPhonePerformannece(Android android) {
		android.installPlayStore();
		android.preInstalledAnroidApp();

		if (android instanceof Mobile) {
			Mobile mob = (Mobile) android;
			mob.installMSOffice();
		}

	}

}
