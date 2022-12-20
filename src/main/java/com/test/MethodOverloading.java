package com.test;

public class MethodOverloading {

public static void main(String args[]) {
	int l = 10;
	int b=10;
	float r=5.5f;
	
	int rectangle_area =area(10,10);
	float circle_area = area(r);
	
	System.out.println("Area of rectangle is"+" "+rectangle_area);
	System.out.println("Area of rectangle is"+" "+circle_area);
}
public static int area(int n1,int n2){
	
	int result =n1*n2;
	
	return result;
}
public static float area(float n) {
	float result=5.5f*n*n;
	
	return result;
}
}
	
	
