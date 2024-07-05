package com.xworkz.arrow.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrowRunner {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(85);
		list.add(41);
		list.add(8);
		list.add(112);
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i, Integer j) {
				if(i % 10 < j % 10) {
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
