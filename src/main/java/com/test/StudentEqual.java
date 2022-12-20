package com.test;

public class StudentEqual {

	private int rollNumber;
	private String name;
	private String address;
	
	
	public StudentEqual(int rollNumber, String name, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		
		StudentEqual studentEqual = (StudentEqual) obj;
		
		return (studentEqual.rollNumber == this.rollNumber);
	}
	
	@Override
	public int hashCode() {
		return this.rollNumber;
	}
	
	
}
