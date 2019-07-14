package edu.gs.testing.corejava.ntupractice;

import java.util.Arrays;

class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;

	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getAuthorNames() {

		// String name1 = authors[0].getName();
		// String name2 = authors[1].getName();
		// String name3 = authors[2].getName();

		String initialName = authors[0].getName();
		for (int i = 1; i < authors.length; i++) {
			initialName = initialName + "," + authors[i].getName();
		}

		return initialName;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty
				+ "]";
	}

}

class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

}

public class TestBookAuthor {

	public static void main(String[] args) {
		Author author1 = new Author("Josh Bloch", "fffg@ddf.com", 'M');
		Author author2 = new Author("vladmiir", "kjgkjgk@cdd.omc", 'F');
		Author author3 = new Author("monika", "ssfsf@cdd.omc", 'F');

		Author[] authorsArray = new Author[3];
		authorsArray[0] = author1;
		authorsArray[1] = author2;
		authorsArray[2] = author3;

		System.out.println(author1.getName());
		System.out.println(author1);

		Book book = new Book("Effective java", authorsArray, 34.4, 45);

		System.out.println(book);

		// System.out.println("name of the author " + book.getAuthor().getName());

		Book book2 = new Book("Java book1", authorsArray, 8778.879);

		System.out.println(book2);

		System.out.println(book2.getAuthorNames());

	}

}
