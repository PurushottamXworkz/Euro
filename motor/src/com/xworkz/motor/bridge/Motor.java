package com.xworkz.motor.bridge;

import com.xworkz.motor.things.Power;
import com.xworkz.motor.things.Transformer;
import com.xworkz.motor.things.Wire;

public class Motor implements Power , Transformer , Wire{

	@Override
	public void typeOfwire() {
		System.out.println("Copper");
		
	}

	@Override
	public void cost() {
		System.out.println("2000");
		
	}

	@Override
	public void voltage() {
		System.out.println("230");
		
	}

	@Override
	public void address() {
		System.out.println("Bhadravati");
		
	}

	@Override
	public void supplyPower() {
		System.out.println("Through transformers");
		
	}

	@Override
	public void location() {
		System.out.println("Residential location");
		
	}

}
