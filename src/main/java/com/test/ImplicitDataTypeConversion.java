package com.test;

public class ImplicitDataTypeConversion {
	public static void main (String args[]) {
		
		int a = 100;
		System.out.println("Int representation:  "+a);
		
		long b = a;
		System.out.println("Long representation:  "+b);
		
		float c = b;
		System.out.println("Float representation:  "+c);
	}
}
