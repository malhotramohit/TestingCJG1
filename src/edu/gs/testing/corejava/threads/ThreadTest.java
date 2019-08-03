package edu.gs.testing.corejava.threads;

class Sing extends Thread {

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am singing");
	}
}

class Dance implements Runnable {

	private Thread singThread;

	public Dance(Thread singThread) {
		this.singThread = singThread;
	}

	@Override
	public void run() {
		try {
			singThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am dancing");
	}

}

public class ThreadTest {

	public static void main(String[] args) {
		// 1 create 1 instance of thread class
		Thread singThread = new Sing();// new

		// 2) thread spwaning start
		singThread.start(); // runnable :
		// singThread.start(); // runnable :

		// use cons of thread class which accepts Runnable ko : Dance

		// way2 create a thread
		Thread danceThread = new Thread(new Dance(singThread));

		danceThread.start();

		try {
			singThread.join();
			danceThread.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main is still doing somework");

	}

}
