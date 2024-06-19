package com.xworkz.asus.bridge;

import com.xworkz.asus.things.Laptop;
import com.xworkz.asus.things.Monitor;

public class Asus implements Laptop , Monitor {

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("This is Asus class size method");
	}

	@Override
	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("This is Asus class processor method");
	}

	@Override
	public String name() {
		String name="samsung"; 
		System.out.println("this is the STring meyhods"+name);
		return name;
	}
	
}
