package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Books {
	
	@Id
	private int id;
	private String bookName;
	
	
	
	public Books(int id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + "]";
	}
	
	
	

}
