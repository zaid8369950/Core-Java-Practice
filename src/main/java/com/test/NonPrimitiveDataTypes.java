package com.test;

public class NonPrimitiveDataTypes {
	public static void main (String args[]) {
		String str = "test";
		System.out.println("String is" + str);
		
		String str1 = new String("test");
		System.out.println("Another String " + str1);
		
		int arr[];
		arr = new int[3]; //mem has c
		arr[0] = 7;
		arr[1] = 9;
		arr[2] = 10;
		
		System.out.println(arr);
		System.out.println(arr[2]);
		System.out.println(arr[0]);
				}
}
