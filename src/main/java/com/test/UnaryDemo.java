package com.test;

public class UnaryDemo {
	public static void main (String args[]) {
		int result = +1;
		
		// result is now 1
		System.out.println(result);
		
		result--;
		// result is now 0
		System.out.println(result);
		
		result++;
		// result is now 1
		System.out.println(result);
		
		result = -result;
		// result is now -1
		System.out.println(result);
		
		boolean sucess = false;
		//fase
		System.out.println(sucess);
		//true
		System.out.println(!sucess);
	}
}
