package com.test;

public class First {
    public First()
    {
    	System.out.println("a");
    }
}

class Second extends First {
	public Second() {
		System.out.println("b");
	}
}

class Third extends Second{
	public Third() {
		System.out.println("c");
	}
}


