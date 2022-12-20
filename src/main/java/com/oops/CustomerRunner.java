package com.oops;

public class CustomerRunner {

	public static void main(String[] args) {
		
		
		Address homeAddress =new Address("line 1" , "mumbai" , "400070");
		Customer customer =new Customer("zaid",homeAddress);
		
		
		Address workAddress =new Address("line 1 for work" , "mumbai" , "400172");
		customer.setWorkaddress(workAddress);
		
		System.out.println(customer);
			}
	
}
