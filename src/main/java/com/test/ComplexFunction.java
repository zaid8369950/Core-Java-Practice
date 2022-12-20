package com.test;

public class ComplexFunction {

	int calculateFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return ( n * calculateFactorial(n-1));
		}
	}
}
