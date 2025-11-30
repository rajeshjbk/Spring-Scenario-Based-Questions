package com.raj.sbeans;

public class Book {

	int bookId;
	String bookTitle;
	Author author;
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		
		System.out.print("Book: "+bookTitle);
		author.showAuthorInfo();
	}
}
