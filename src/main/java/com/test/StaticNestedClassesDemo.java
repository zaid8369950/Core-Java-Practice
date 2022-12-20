package com.test;

public class StaticNestedClassesDemo {

	public static void main(String[] args) {
		// accessing a static nested class
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		
		nestedObject.display(); 

	}

}
