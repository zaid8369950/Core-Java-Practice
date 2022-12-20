package com.test;



public class AbstractionDemo {

	public static void main(String[] args) {
		GraphicObject circle = new Circle();
		circle.draw();
		circle.resize();
		
		GraphicObject rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();
	}
}
