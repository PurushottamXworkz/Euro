package com.xworkz.childClass;

import com.xworkz.things.Uddinbele;
import com.xworkz.things.Water;

public class Vada implements Uddinbele,Water {

	@Override
	public void water() {
		// TODO Auto-generated method stub
		System.out.println("This is water from water interface");
	}

	@Override
	public void salt() {
		// TODO Auto-generated method stub
		System.out.println("This is salt from water interface");
	}

	@Override
	public void uddinbele() {
		// TODO Auto-generated method stub
		System.out.println("This is uddinbele from uddinbele interface");		
	}

	@Override
	public void unitOfBele() {
		// TODO Auto-generated method stub
		System.out.println("This is unitOfbele from uddinbele interface");
	}
}
