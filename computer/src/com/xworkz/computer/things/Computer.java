package com.xworkz.computer.things;

public abstract class Computer {

	public abstract void motherBoard();
	public abstract void keyBoard();
	
	public void sound() {
		System.out.println("This is sound instance method from Computer class");
	}
	
	public void inputs() {
		System.out.println("This is inputs instance method from Computer class");
	}
}
