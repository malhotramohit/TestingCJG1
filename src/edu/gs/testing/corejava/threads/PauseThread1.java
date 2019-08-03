package edu.gs.testing.corejava.threads;

public class PauseThread1 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i is " + i);
		}

	}

}
