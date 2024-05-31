package com.xworkz.box;

public class Box {
	
	public static int boxes=10;
	public boolean ifBoxavailable;

	public Box() {
		System.out.println("This is no argument constructor");
	}
	
	public static void numberOfBox() {
		System.out.println("total number of Box is :"+boxes);
	}
	
	public void checkAvailability(boolean ifBoxavailable) {		
		this.ifBoxavailable=ifBoxavailable;
		System.out.println("Boxes available :"+this.ifBoxavailable);
	}
}
