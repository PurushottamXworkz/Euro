package com.xworkz.towel;

public class Towel {
	public static int valueOfTowel=250;
	
	public int price;
	
	public Towel() {
		System.out.println("This is no argument constructor");
	}
	
	public static void value() {	
		System.out.println("Value of towel is :"+valueOfTowel);
	}
	
	public void cost(int price) {
		this.price=price;
		System.out.println("cost Towel :"+this.price);
		System.err.println("cost Towel :"+this.price);
	}
}
