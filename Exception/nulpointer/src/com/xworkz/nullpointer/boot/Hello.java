package com.xworkz.nullpointer.boot;

public class Hello {
	public static void main(String[] args) {
		String storeName = "Rahagvendra";
		System.out.println("The length of name of store is: "+storeName.length());
		storeName =null;
		try {
		System.out.println("The length of name of store is: "+storeName.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("The Name of store at the end ");
		}
	}
}
