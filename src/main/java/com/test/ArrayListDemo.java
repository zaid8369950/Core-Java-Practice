package com.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main (String args[]) {
		 List<Integer> arrayList = new ArrayList<>(5);
		 
		 for(int i=1; i <= 5; i++) {
			 arrayList.add(i);
		 }
		 
		 // Printing elements
		 System.out.println(arrayList);
		 
		 //Remove Element at index 3
		 arrayList.remove(3);
		 
		 // Displaying the arrayList
		 // after Deletion
		 System.out.println(arrayList);
		 
		 // Printing Element one by one
		 for (int i=0; i < arrayList.size(); i++) {
			 System.out.print(arrayList.get(i) + " ");
		 }
		 
		 //Enhanced loop
//		 for (int i : arrayList) {
//			 System.out.println(i);
//		 }
	}

}
