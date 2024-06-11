package com.xworkz.motor.boot;

import com.xworkz.motor.bridge.Motor;

public class MotorRunner {
	public static void main(String args[]) {
		Motor moto= new Motor();
		moto.address();
		moto.cost();
		moto.location();
		moto.supplyPower();
		moto.voltage();
	}
}
