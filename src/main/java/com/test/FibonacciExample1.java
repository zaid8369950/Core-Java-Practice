package com.test;

public class FibonacciExample1 {
 
public static void main (String args[]) {
	 int n1=0,n2=4,n3,i,count=10;
	 System.out.print(n1+" "+n2);//printing 0 and 4
	 
	 for (i=5;i<count;++i)//loop starts from 5 because 0 and 4 are already printed
		 
	 {
		 n3=n1+n2;
		 System.out.print(" "+n3);
		 n1=n2;
		 n2=n3;
	 }
	 
	 
 }
}
