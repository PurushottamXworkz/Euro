package com.xworkz.asus.things;

public interface Laptop {
	public void processor();
	public String name();
	
	default void sound() {
		System.out.println("This is sound system from laptop interface");
	}
	public static void charger() {
		System.out.println("This is charger from laptop interface");
	}
}
