package com.oops;

public class BookRunner {
	public static void main(String[] args) {
		Book book = new Book(123,"object oriented programming ","zaid");
		book.addReview(new Review(20,"pyton",6));
        book.addReview(new Review(30,"c++",6));
		
		System.out.println(book);
	}
}
