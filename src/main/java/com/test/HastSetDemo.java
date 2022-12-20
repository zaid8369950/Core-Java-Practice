package com.test;

import java.util.HashSet;
import java.util.Set;

public class HastSetDemo {
	public static void main (String args[]) {
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("C");
		
		System.out.println(hashSet);
		
		System.out.println("List Contains C or not? " + hashSet.contains("c"));
		
		hashSet.remove("A");
		System.out.println("Set after removing A :" + hashSet);
		
		for(String item : hashSet) {
			System.out.println(item);
		}
	}
}
