package com.oops;

public class MarioGame implements GamingConsole  {

	@Override
	public void up() {
		System.out.println("Jumping block");
		
	}

	@Override
	public void down() {
		System.out.println("sleading down");
		
	}

	@Override
	public void right() {
		System.out.println("firing to enemy");
		
	}

	@Override
	public void left() {
		System.out.println("defencing from a pro-player	");
		
	}
}
