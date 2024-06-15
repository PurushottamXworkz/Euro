package com.xworkz.supermarket.bridge;

import com.xworkz.supermarket.things.SuperMarket;

public class SupermarketBridge implements SuperMarket {

	@Override
	public void billing() {
		// TODO Auto-generated method stub
		System.out.println("This is supermarket class implementing billing");
	}

	@Override
	public void stocks() {
		// TODO Auto-generated method stub
		System.out.println("This is supermarket class stocks billing");
	}

}
