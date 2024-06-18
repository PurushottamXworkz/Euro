package com.xworkz.stocks.boot;

import com.xworkz.stocks.bridge.StockBridge;
import com.xworkz.stocks.object.Stock;

public class StockRunner {
	public static void main(String[] args) {
		StockBridge bridge=new StockBridge();
		Stock stock=new Stock(bridge);
		stock.getHolders();
		
	}
}
