package com.xworkz.shops.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.shops.dto.ShopsnameDto;

public class ShopsRunner {
	
	public static void main(String[] args) {
		
		String shopName="Ramesh strore";
		String shopName2="Rolex strore";
		String shopName3="Ganapati strore";
		String shopName4="Munna strore";
		
		Collection<String> collection = new ArrayList<>();
		
		collection.add(shopName);
		collection.add(shopName2);
		collection.add(shopName3);
		collection.add(shopName4);
		
		Iterator<String> iterator =collection.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("String iterator "+iterator.next());
		}
		
		System.out.println(collection.isEmpty());
		System.out.println(collection.contains(shopName3));
		System.out.println(collection.equals(collection));
		
	}
}
