package com.test;

public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClassDemo.InnerClass in = new OuterClassDemo().new InnerClass();
	in.display();
		
		OuterClassDemo outerClass = new OuterClassDemo();
		outerClass.outerClassMethod();
	}
}
