package edu.gs.testing.corejava.threads;

import java.util.Set;

class Pen {

}

class Studentt extends Thread {
	Pen pen;

	public Studentt(Pen pen) {
		this.pen = pen;
	}

	@Override
	public void run() {
		System.out.println(String.format("%s Doing some work with pen ", this.getName()));
		System.out.println(String.format("%s Going to wait for pen ", this.getName()));

		synchronized (pen) {
			try {
				pen.notify();
				pen.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println(String.format("%s Wait over again using pen", this.getName()));
		
		
		Set<Thread> threads = Thread.getAllStackTraces().keySet();
		for (Thread th : threads) {
			System.out.println(th.getName() + " " + th.getState());
		}
		
		synchronized (pen) {

			pen.notify();
		}
	}
}

public class WaitNotifyExample1 {
	public static void main(String[] args) throws InterruptedException {
		Pen pen = new Pen();
		Thread st1 = new Thread(new Studentt(pen));
		Thread st2 = new Thread(new Studentt(pen));
		st1.start();
		st2.start();
//		Thread.sleep(1000);
//		synchronized (pen) {
//
//			pen.notify();
//		}

		// st1.join();
		// st2.join();

	}
}