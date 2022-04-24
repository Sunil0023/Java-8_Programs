package com.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	List<Book> books=new ArrayList<>();
	
	public List<Book> getenrateBooks() {
		
		books.add(new Book(9,"Java",200));
		books.add(new Book(10,"Spring",300));
		books.add(new Book(12,"Hibernate",120));
		books.add(new Book(32,"SpringBoot",400));
		books.add(new Book(16,"Database",150));
		books.add(new Book(3,"Cloud",1200));
		return books;
	}
}
