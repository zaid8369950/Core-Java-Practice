package com.oops;

public class StudentRunner {

	public static void main(String[] args) {
		   Student student = new Student();
		student.setName("zaid");
			student.setEmail("zaid456@gmail.com");
			
			Person person = new Person();
			person.setName("zaid");
			person.setEmail("zaid236@gamil.com");
			person.setPhonenumber("9323232105");
		    String value=	person.toString();
			System.out.println(value);
			System.out.println(person.toString());
			
		}
	
}
