package com.test;

public class Array {
  public static void main (String args[]) {
	  int num = 20;
	  
	  int a[] = new int[20];
	  int b[] = new int[20];
	  int c[] = new int[20];
	  
	  for(int i=0;i<20;i++) {
		  a[i]=i;
	  }
	  for(int i=0;i<20;i++) {
		  b[i]=i;
		  ++num;
	  }
	  System.out.println("values in array a");
	  for(int i=0;i<20;i++) {
		  System.out.print(a[i]+" ");
	  }
	  System.out.println();
	  System.out.println("values in array b");
	  for(int i=0;i<20;i++) {
		  System.out.print(b[i]+" ");
	  }
	  for(int i=0;i<20;i++) {
		  c[i]=a[i]+b[i];
	  }
	  System.out.println();
	  System.out.println("values in array c");
	  for(int i=0;i<20;i++) {
		  System.out.print(b[i]+" ");
	  }
  }}