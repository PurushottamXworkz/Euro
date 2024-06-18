package com.xworkz.metrowholesale.boot;

import com.xworkz.metrowholesale.bridge.MetroBridge;
import com.xworkz.metrowholesale.object.Shop;

public class MetroRunner {
public static void main(String[] args) {
	MetroBridge bridge=new MetroBridge();
		
		Shop shop=new Shop(bridge);
		
		shop.getShops();
	}
}
