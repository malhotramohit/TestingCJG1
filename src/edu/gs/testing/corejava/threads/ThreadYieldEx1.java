package edu.gs.testing.corejava.threads;

class Consumer extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Consumer is  con some " + i);
			Thread.yield();
		}
	}

}

class Producer implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Producer is  prod some " + i);
			Thread.yield();
		}
	}

}

public class ThreadYieldEx1 {

	public static void main(String[] args) {
		Thread prod = new Thread(new Producer());
		Thread cons = new Thread(new Consumer());
		cons.setPriority(Thread.MIN_PRIORITY);
		prod.setPriority(Thread.MAX_PRIORITY);

		// new Consumer();

		prod.start();

		cons.start();

	}

}
