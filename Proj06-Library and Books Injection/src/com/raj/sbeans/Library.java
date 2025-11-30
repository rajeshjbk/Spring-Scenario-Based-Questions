package com.raj.sbeans;

public class Library {

	Book book1, book2, book3;

	public void setBook1(Book book1) {
		this.book1 = book1;
	}

	public void setBook2(Book book2) {
		this.book2 = book2;
	}

	public void setBook3(Book book3) {
		this.book3 = book3;
	}
	
	public void displayBooks() {
		System.out.println("Book1: "+book1);
		System.out.println("Book2: "+book2);
		System.out.println("Book3: "+book3);
	}
}
