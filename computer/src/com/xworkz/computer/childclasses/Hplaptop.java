package com.xworkz.computer.childclasses;

import com.xworkz.computer.things.Computer;

public class Hplaptop extends Computer{
	public static String model="HP65@1"; 
	public void motherBoard() {
		System.out.println("This is HpLaptop class implimenting abstraction motherBoard ");
	}
	public void keyBoard() {
		System.out.println("This is HpLaptop class implimenting abstraction keyBoard ");
	}
	public void storage() {
		System.out.println("This is Hplaptop class implimenting storage method");
	}
}
