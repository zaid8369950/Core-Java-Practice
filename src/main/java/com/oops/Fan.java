package com.oops;

public class Fan {

	private String make;
	private double radius;
	private String colour;


	private boolean isOn;
	private byte speed;


	 public Fan(String string, double d, String string2) {
		this.make=make;
		this.radius=radius;
		this.colour=colour;
	}
	public void isOn(boolean isOn) {
		this.isOn=isOn;
	}
	 public void switchOn() {
		 this.isOn=true;
	 }
	 public void switchOff() {
		 this.isOn=false;
		 this.setSpeed((byte)0);
	 }
	 public void setSpeed(byte speed) {
		 this.speed=speed;
		 
	 }
	public String toString() {
		return String.format("make- %s, radius- %f,colour- %s,isOn- %b,speed- %d",make,radius,colour,isOn,speed);
	}

	
}
