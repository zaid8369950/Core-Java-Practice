package com.test;



public class AddingTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
     int a[] = new int[5];
     int b[] = new int[5];
     int c[] = new int[5];
     
     for (int i=0;i<5;i++) {
    	 a[i]=i;
     }
     
     for (int i=0;i<5;i++) {
    	 b[i]=num;
    	 ++num;      	 	
     }
     
          System.out.println("values in Array A:");
          
     for (int i=0;i<5;i++) {
    	     	 System.out.print(a[i]+" ");
     }
     
     System.out.println();
     System.out.println("values in Array B:");
     for (int i=0;i<5;i++) {
    	 System.out.print(b[i]+" ");
     }
     for (int i=0;i<5;i++) {
    	 c[i]=a[i]+b[i];
     }
     System.out.println();
     System.out.println("values in Array C:");
     
     for(int i=0;i<5;i++) {
    	 System.out.print(c[i]+" ");
     }
	}

}
