package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
	public static void main(String[] args) {
		ArrayList<Name> list = new ArrayList<Name>();
		Name ronaldo = new Name(4,"CRISTIANO RONALDO",18);
		Name messi = new Name(2,"LIONEL MESSI",16);
		Name nymar = new Name(3,"NYMAR",17);
		Name pele = new Name(1,"PELE",15);
		
		list.add(messi);
		list.add(nymar);
		list.add(ronaldo);
		list.add(pele);
		
		Collections.sort(list);
		System.out.println("student after natural sorting : ");
		list.forEach(name -> System.out.println(name.getName()));
		
		Collections.sort(list, new AgeComparator());
		System.out.println("Student after AGE sorting : ");
		list.forEach(name -> System.out.println(name.getName()));
	}
}
