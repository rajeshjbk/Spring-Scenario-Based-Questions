package com.raj.sbeans;

import java.util.List;

public class Library {

	String libraryName;
	List<Book> books;
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void displayLibraryInfo() {
		
		System.out.println("Library: "+libraryName);
		System.out.println("Books Available:");
		for(Book book:books) {
			book.showBookInfo();
		}
	}
	
}
