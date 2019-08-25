package edu.gs.testing.corejava.threads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class UserDetailServiceImpl {

	// eager intialization
	private static UserDetailServiceImpl instnace;

	private UserDetailServiceImpl() {

	}

	public UserDetailServiceImpl(int i, int j) {

	}

	// lazy initailization with double check locking
	public static UserDetailServiceImpl getInstance() {
		if (instnace == null) {
			synchronized (UserDetailServiceImpl.class) {
				if (instnace == null) {
					instnace = new UserDetailServiceImpl();
				}

			}
		}
		return instnace;
	}

}

public class Singeltone {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {

		// instnace one 1 edu.gs.testing.corejava.threads.UserDetailServiceImpl@33909752

		// instnace one 1 edu.gs.testing.corejava.threads.UserDetailServiceImpl@33909752
		// instnace one 2 edu.gs.testing.corejava.threads.UserDetailServiceImpl@33909752

		new Thread(() -> {
			UserDetailServiceImpl detailServiceImpl1 = UserDetailServiceImpl.getInstance();
			System.out.println("instnace one 1 " + detailServiceImpl1);
		}).start();

		new Thread(() -> {
			UserDetailServiceImpl detailServiceImpl2 = UserDetailServiceImpl.getInstance();
			System.out.println("instnace one 2 " + detailServiceImpl2);

		}).start();
		// instnace one 1 edu.gs.testing.corejava.threads.UserDetailServiceImpl@6ab31cd3
		// instnace one 2 edu.gs.testing.corejava.threads.UserDetailServiceImpl@69656e74

		Constructor<UserDetailServiceImpl>[] constructors = (Constructor<UserDetailServiceImpl>[]) UserDetailServiceImpl.class
				.getDeclaredConstructors();

		System.out.println(Arrays.toString(constructors));

		// [private edu.gs.testing.corejava.threads.UserDetailServiceImpl(), public
		// edu.gs.testing.corejava.threads.UserDetailServiceImpl(int,int)]

		// [private edu.gs.testing.corejava.threads.UserDetailServiceImpl()]

		String instance1 = "instnace";
		Field field1 = UserDetailServiceImpl.class.getDeclaredField("instnace");

		System.out.println(field1);
		// private static edu.gs.testing.corejava.threads.UserDetailServiceImpl
		// edu.gs.testing.corejava.threads.UserDetailServiceImpl.instnace
		// instnace
		//
		instance1 = instance1.substring(0, 1).toUpperCase() + instance1.subSequence(1, instance1.length());
		instance1 = "get" + instance1;
		System.out.println(instance1);
		// System.out.println(Arrays.toString(constructors));

		Method method = UserDetailServiceImpl.class.getMethod(instance1, field1.getType());
		UserDetailServiceImpl obj= UserDetailServiceImpl.class.newInstance();
		method.invoke(obj, null);
		

	}

}
