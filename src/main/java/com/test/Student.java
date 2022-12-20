package com.test;

public class Student {

	private String name;
	private int age;
	private String address;
	
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return  ("Student name is "+this.getName() +
				", age is: "+ this.getAge() +" and address is: "+
				this.getAddress());
	}
	
	public static void main (String args[]) {
		StudentClass john = new StudentClass("john",25, "23 East , claifornia");
		
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
	}
	
	
	
}
