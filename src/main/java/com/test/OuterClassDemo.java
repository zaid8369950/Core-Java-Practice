package com.test;

public class OuterClassDemo {

	class InnerClass {
		public void display() {
			System.out.println("This is a inner class method");
		}
	}
		void outerClassMethod() {
			
			System.out.println("in the outer class method");
			
			
		class MethodLocalClass{
			void localInnerMethod() {
				System.out.println("in the method local class: Method");
			}
		}
		
		MethodLocalClass mlc = new MethodLocalClass();
		mlc.localInnerMethod();
		}
	}

