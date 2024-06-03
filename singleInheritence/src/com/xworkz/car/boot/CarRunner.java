package com.xworkz.car.boot;

import com.xworkz.car.childClasses.Gear;

public class CarRunner {
	public static void main(String args[]) {
		Gear gear = new Gear();
		System.out.println("This is Main class");
		gear.methodGear();
		gear.methodCar();
	}
}
