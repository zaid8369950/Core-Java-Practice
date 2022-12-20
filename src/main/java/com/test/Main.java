package com.test;

 class Main {
	 public static void main(String[] args) {
		 StudentEqual john = new StudentEqual(1, "John", "23 East, California");
		 StudentEqual john2 = new StudentEqual(1, "John", "23 East, California");
		 StudentEqual john3 = new StudentEqual(1, "John", "23 East, California");
		 		 
		 System.out.println(john.equals(john2));
	 }
}
