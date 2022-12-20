package com.test;

public class ExplicitDataTypesConversion {
	public static void main (String args[]) {
		
		double a = 79.68;
		System.out.println("Double representation:  "+a);
		
		float f = (float)a;
		System.out.println("Float representation:  "+f);
		
		long b = (long)a;
		System.out.println("Long representation:  "+b);
		
		int c = (int)b;
		System.out.println("Int representation:  "+c);
		
		
	}
}
