package com.xworkz.sward.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SwardsStringRunner {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hanumantha");
		list.add("Ramachandra");
		list.add("Shrehari");
		list.add("Raghunatha");
		Comparator<String> comparator =new Comparator<String>() {
			
			@Override
			public int compare(String i, String j) {
				Character i2=i.charAt(i.length()-7);
				Character j2=j.charAt(j.length()-7);
				return i2.compareTo(j2);
			}
		};
		
		Collections.sort(list,comparator);
		for (String string : list) {
			System.out.println("list : "+list);
		}
	}
}
