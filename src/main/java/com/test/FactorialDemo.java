package com.test;

public class FactorialDemo {
	public static void main(String[] args) {
		ComplexFunction complexFunction = new ComplexFunction();
		
		int result = complexFunction.calculateFactorial(5);
		
		System.out.println("Factorial of 5 is: " + result);
	}
}
