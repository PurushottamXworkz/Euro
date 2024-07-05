package com.xworkz.sward.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SwardsRunner {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Parashuraam");
		list.add("Purushottam");
		list.add("Parjanyachala");
		list.add("Yudidhistira");
		
		Comparator<String> comparator= new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				Character o3=o1.charAt(o1.length()-4);
				Character o4=o2.charAt(o2.length()-4);
				
				return o3.compareTo(o4);
			}
		};
		
		Collections.sort(list,comparator);
		for (String string : list) {
			System.out.println("list : "+list);
		}
	}
}
