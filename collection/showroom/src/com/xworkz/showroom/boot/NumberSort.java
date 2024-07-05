package com.xworkz.showroom.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumberSort {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(9);
		list.add(97);
		list.add(58);
		list.add(27);
		list.add(2);
		
		Comparator<Integer> compare = new Comparator<Integer>() {	//anonymous class		
			@Override
			public int compare(Integer i, Integer j) {
				if(i % 10 > j % 10) {
					return 1;
				}
				return -1;
			}
		};
		
		Collections.sort(list,compare);
		
		for (Integer integer : list) {
		System.out.println("Sorted list values: "+integer);	
		}
	}
}
