package edu.gs.testing.corejava.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {
	public static void main(String[] args) {

		try {
			openProfile();
		} catch (CustomException e) {
			e.printStackTrace();
		}

	}

	private static void openProfile() throws CustomException {
		findProfile();
	}

	private static void findProfile() throws CustomException {
		readProfile();
	}

	private static void readProfile() throws CustomException {
		updateProfile();
	}

	private static void updateProfile() throws CustomException {

		try {
			FileInputStream fileInputStream = new FileInputStream(new File("D:/Local:vjh"));
		} catch (FileNotFoundException e) {
			throw new CustomException("File not found", e);
		}

	}

}
