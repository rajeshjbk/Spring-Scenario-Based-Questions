package com.raj.sbeans;

public class Author {

	int authorId;
	String authorName;
	String country;
	
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void showAuthorInfo() {
		
		System.out.println(" | Author: "+authorName);
	}
}
