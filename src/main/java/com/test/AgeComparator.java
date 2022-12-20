package com.test;

import java.util.Comparator;

public class AgeComparator implements Comparator<Name> {

	@Override
	public int compare(Name name1, Name name2) {
		if(name1.getAge() < name2.getAge()) {
			return 1;
		}
		if(name1.getAge() < name2.getAge()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
