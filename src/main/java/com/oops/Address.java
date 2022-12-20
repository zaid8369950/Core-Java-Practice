package com.oops;

public class Address {
	private String line1;
	private String city;
	private String pincode;

		

	public Address(String line1, String city, String pincode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.pincode = pincode;
	}
	public String toString() {
		return line1+ " "+ city+  " "+pincode;
		
	}
}
