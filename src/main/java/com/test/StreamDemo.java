package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main (String args[]) {
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		
//		List<Integer> squaresList = new ArrayList<>();
//		for(Integer i: numberList) {
//			squaresList.add(i*i);
//		}
//		
		List<Integer> squaresList = numberList.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("List of squared numbers: " + squaresList);
		
		
		Set<Integer> squareSet = new HashSet<>();
		for(Integer i: numberList) {
			squaresList.add(i*i);
		}
				
//		Set<Integer> squareSet = 
//				numberList.stream().map(x->x*x).collect(Collectors.toSet());
//		System.out.println("Set of squared numbers: " + squareSet);
		
		List<String> languages = new ArrayList<>();
		languages.add("java");
		languages.add("python");
		languages.add("scala");
		
		List<String> filterResult = new ArrayList<>();
		for(String s: filterResult) {
			if(s.startsWith("p")) {
				filterResult.add(s);
			}
		}
		
//		List<String> filterResult = languages.stream().filter(s->s.startsWith("p")).
//				     collect(Collectors.toList());
//		System.out.println("Languages starting with 'p': " + filterResult);
		
		List<String> sortedList =
				languages.stream().sorted().collect(Collectors.toList());
		System.out.println("Languages sorted alphabetically: " + sortedList);
		
		//demonstration of forEach method
		System.out.println("Printing all elements one by one: ");
		numberList.stream().map(x->x*x).forEach(y -> System.out.println("element is: "+ y));
		
		//demonstration of reduce method
		int sum =
				numberList.stream().reduce(0, (ans,i)-> ans+i);
		
		System.out.println("sum of all elements in the numberlist: " + sum);
	}
}
