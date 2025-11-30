package com.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Book {

	int bookId;
	String bookTitle;
	private Author author;
	
	public Book(int bookId, String bookTitle) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}

	@Autowired
	@Qualifier("author1")
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void displayBookDetails() {
		
		System.out.print("Book: "+bookTitle+" | ");
		author.displayAuthorInfo();
	}

	
}
