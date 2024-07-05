package com.xworkz.arrow.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrowsNumberRunner {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1119);
		list.add(1439);
		
		list.add(1205);
		list.add(9990);
		
		
		Comparator<Integer> comparator= new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i, Integer j) {
			if(i % 1000 > j % 1000) {
				return 1;
			}
				return -1;
			}
		};
		
		Collections.sort(list,comparator);
		for (Integer integer : list) {
			System.out.println("list :"+list);
		}
	}
}
