package com.xworkz.supermarket.object;

import com.xworkz.supermarket.things.SuperMarket;

public class Shop {
		public SuperMarket stock;
		
		public Shop(SuperMarket stock) {
		this.stock=stock;	
		}

		public SuperMarket getStock() {
			System.out.println("This is get stock from shop");
			return stock;
		}

		public void setStock(SuperMarket stock) {
			this.stock = stock;
		}
		
}
