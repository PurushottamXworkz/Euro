package com.xworkz.tomato;

public class Tomato {
	
	public static String sizeOfTomato="Large";
	public int cost;

	public Tomato() {
		System.out.println("This is no argument constructor");
	}
	
	public static void tomatoSize() {	
		System.out.println("Size of tomato is :"+sizeOfTomato);
	}
	
	public void price(int cost) {
		this.cost=cost;
		System.out.println("Price of tomato for KG :"+this.cost);
	}
}
