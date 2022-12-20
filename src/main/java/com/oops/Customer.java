package com.oops;

public class Customer {

	private String name;
	private Address homeaddress;
	private Address workaddress;

	public Customer(String name, Address homeaddress) {
		this.name=name;
		this.homeaddress=homeaddress;
	}

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public Address getWorkaddress() {
		return workaddress;
	}

	public void setWorkaddress(Address workaddress) {
		this.workaddress = workaddress;
	}
	public String toString() {
		return String.format("name - [%s] home address  -  [%s]  work address  -   [%s])  ",name,homeaddress,workaddress);
	}
	
}
