package com.oops;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacture the fan",0.3145,"Blue");
		fan.switchOn();
		fan.setSpeed((byte )5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}
	
}
