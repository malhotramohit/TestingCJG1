package edu.gs.testing.corejava.threads;

class Book {

	String title;
	static int copiesSold = 0;

	Book(String title) {
		this.title = title;
	}

	public static void newSale() {
		int reg = copiesSold;
		reg++;
		copiesSold = reg;
	}

	public synchronized static void returnBook() {
		int reg = copiesSold;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reg--;
		copiesSold = reg;
	}

	public static synchronized void m1() {
		System.out.println("m1 --");
	}

}

class OnlineBuy extends Thread {
	Book book;

	public OnlineBuy(Book book) {
		this.book = book;
	}

	@Override
	public void run() {
		book.newSale();
	}

}

class OnlineReturn extends Thread {
	Book book;

	public OnlineReturn(Book book) {
		this.book = book;
	}

	@Override
	public void run() {
		book.returnBook();
	}

}

class TestThread extends Thread {

	Book book;

	public TestThread(Book book) {
		this.book = book;
	}

	@Override
	public void run() {
		book.m1();
	}
}

public class ShoppingCart {
	public static void main(String[] args) {
		Book book = new Book("Java");
		Thread onlineBuy1 = new OnlineBuy(book);
		Thread onlineBuy2 = new OnlineBuy(book);
		Thread onlineReturn = new OnlineReturn(book);
		Thread testTh = new TestThread(book);
		testTh.start();

		onlineReturn.start();
		onlineBuy1.start();
		onlineBuy2.start();

		try {
			onlineBuy1.join();
			onlineBuy2.join();
			onlineReturn.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(book.copiesSold);

	}

}