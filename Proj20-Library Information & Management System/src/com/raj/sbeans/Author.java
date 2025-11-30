package com.raj.sbeans;

public class Author {

	int authorId;
	String authorName;

	public Author(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}

	public void displayAuthorInfo() {

		System.out.println("Author: "+authorName);
	}
}
