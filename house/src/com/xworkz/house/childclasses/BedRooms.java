package com.xworkz.house.childclasses;

import com.xworkz.house.things.House;

public class BedRooms extends House{
	public static boolean isMasterBedrrom=true;
	public void noOfArchs() {
		System.out.println("This is number of archs in hall");
	}
	public void cotSize() {
		System.out.println("This is cot size");
	}
	public void noOfMirros() {
		System.out.println("The number of mirrors");
	}
	@Override
	public void hallLength() {
		System.out.println("this is bedrrom area");
	}
}
