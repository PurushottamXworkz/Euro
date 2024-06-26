package com.xworkz.hesarkalu.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.hesarkalu.dto.Hesarkaludto;

public class HesarkaluRunner {
	public static void main(String[] args) {
		Hesarkaludto hesarkaludto= new Hesarkaludto("Gadag", 19000, "Very rich in Iron");
		Hesarkaludto hesarkaludto1= new Hesarkaludto("Dharwad", 1800, "Very rich in Calcium");
		Hesarkaludto hesarkaludto2= new Hesarkaludto("Hubli", 2000, "Very rich in magnisium");
		Hesarkaludto hesarkaludto3= new Hesarkaludto("Raichur", 300, "Very rich in helium");
		
		Collection<Hesarkaludto> collection= new ArrayList<Hesarkaludto>();
		collection.add(hesarkaludto);
		collection.add(hesarkaludto1);
		collection.add(hesarkaludto2);
		collection.add(hesarkaludto3);
		for (Hesarkaludto hesarkaludto11 : collection) {
			System.out.println(hesarkaludto11.toString());
		}
		System.out.println(collection.size());
		collection.remove(hesarkaludto3);
		for (Hesarkaludto hesarkaludto4 : collection) {
			System.out.println(hesarkaludto4.getPlace());
		}
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());
	}

}
 