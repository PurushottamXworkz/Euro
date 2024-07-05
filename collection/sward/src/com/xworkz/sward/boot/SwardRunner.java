package com.xworkz.sward.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SwardRunner {
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		
		list.add("Ram");
		list.add("Shyam");
		list.add("lucky");
		list.add("Amith");
		
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String i, String j) {
				Character i1=i.charAt(i.length()-1);
				Character j2=j.charAt(j.length()-1);
				
				return i1.compareTo(j2);			}
		};
		
		Collections.sort(list,comparator);
		for (String string : list) {
			System.out.println("list : "+list);
		}
	}

}
