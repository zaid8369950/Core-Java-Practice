package com.oops;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get the raw materials");
		System.out.println("get the utensils");
		}

	@Override
	void doTheDish() {
		System.out.println("Do the dish");
		
	}

	@Override
	void cleanup() {
		System.out.println("Clean up the utensils");
		
	}

}
