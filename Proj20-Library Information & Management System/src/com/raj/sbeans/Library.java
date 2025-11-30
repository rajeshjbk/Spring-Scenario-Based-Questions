package com.raj.sbeans;

import java.util.List;

import org.springframework.stereotype.Component;
@Component("library")
public class Library {

	String libraryName;
	List<Book> books;

	
    public Library(String libraryName, List<Book> books) {
		super();
		this.libraryName = libraryName;
		this.books = books;
	}


	public void showLibraryData() {
    	
    	System.out.println("Books Available:");
    	for(Book b:books) {
    		b.displayBookDetails();
    	}
    }

}
