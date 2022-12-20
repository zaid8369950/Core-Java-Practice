package com.test;

public class ElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int marks=68;
		
		if(marks<50) {
			
			System.out.println("Fail");         
			
		}else if(marks>=50 && marks<65) {
			
			System.out.println("D grade");
			
		}else if(marks>=65 && marks<75) {
			
			System.out.println("c grade");
			
		}else if(marks>=75 && marks<90) {
			
			System.out.println("b grade");
			
		}else if(marks>=90 && marks<100) {
			
			System.out.println("A grade");
			
		}else {
			System.out.println("Invalid");
		}
	}

}
