package com.xworkz.stocks.object;

import com.xworkz.stocks.bridge.StockBridge;

public class Stock {
		public StockBridge holders;
		public Stock(StockBridge holders) {
			// TODO Auto-generated constructor stub
			this.holders=holders;
		}

	public StockBridge getHolders() {
		System.out.println("This is get method from stock:"+holders);
		return holders;
	}

	public void setHolders(StockBridge holders) {
		this.holders = holders;
	}
}
