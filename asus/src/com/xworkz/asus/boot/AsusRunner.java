package com.xworkz.asus.boot;

import com.xworkz.asus.bridge.Asus;
import com.xworkz.asus.bridge.AsusComputer;
import com.xworkz.asus.things.Laptop;

public class AsusRunner {
	public static void main(String args[]) {
		Asus asus= new Asus();
		asus.processor();
		asus.sound();
		AsusComputer asusComputer=new AsusComputer();
		asusComputer.size();
		System.out.println(asus.name()); 

	}
}
