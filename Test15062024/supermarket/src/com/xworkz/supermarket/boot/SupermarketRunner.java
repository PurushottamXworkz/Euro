package com.xworkz.supermarket.boot;

import com.xworkz.supermarket.bridge.SupermarketBridge;
import com.xworkz.supermarket.object.Shop;

public class SupermarketRunner {
		public static void main(String[] args) {			
			SupermarketBridge supermarket= new SupermarketBridge();	
			Shop shop=new Shop(supermarket);
			shop.getStock();
		}
}
