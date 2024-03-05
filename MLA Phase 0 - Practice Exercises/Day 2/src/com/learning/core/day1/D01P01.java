package com.learning.core.day1;

import java.util.*;

public class D01P01 {
	
	static Book createBooks() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter book title: ");
		String book_title = in.nextLine();
		
		System.out.print("Enter book price: ");
		int book_price = in.nextInt();
		
		Book b = new Book();
		b.set_book_title(book_title);
		b.set_book_price(book_price);
		
		return b;
	}
	
	static void showBooks(Book b) {
		System.out.println("Book Title: " + b.get_book_title() + " and Price: " + b.get_book_price());
	}
	
	public static void main(String args[]) {
		Book b1 = createBooks();
		showBooks(b1);
	}
}

class Book {
	String book_title;
	int book_price;
	
	String get_book_title() {
		return this.book_title;
	}
	
	int get_book_price() {
		return this.book_price;
	}
	
	void set_book_title(String book_title) {
		this.book_title = book_title;
	}
	
	void set_book_price(int book_price) {
		this.book_price = book_price;
	}
}