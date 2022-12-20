package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Name> list = new ArrayList<Name>();
		Name john = new Name(3, "John", 21);
		Name jane = new Name(1, "Jane", 19);
		Name tom = new Name(2, "tom", 20);
		
		list.add(jane);
		list.add(john);
		list.add(tom);
		
		Collections.sort(list);
		
		System.out.println("Students after sorting : ");
		list.forEach(name -> System.out.println(name.getName()));
		
	}
}
