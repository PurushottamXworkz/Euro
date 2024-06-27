package com.xworkz.shops.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Theatre {
	public static void main(String[] args) {
	
		String theatreName="Padma";
		String theatreName2="Srinivas";
		String theatreName3="Sangham";
		String theatreName4="Vijay";
		
		Collection<String> collection=new ArrayList<String>();
		collection.add(theatreName);
		collection.add(theatreName3);
		collection.add(theatreName2);
		 
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println("Thetre names "+iterator.next()); 
		}
		
		System.out.println(collection.size());
		System.out.println(collection.equals(collection));
		System.out.println(collection.isEmpty());
		
	}
	
}
