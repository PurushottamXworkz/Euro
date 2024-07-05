package com.xworkz.arrow.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrowNumRunner {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		
		list.add(1245047);
		list.add(5241789);
		list.add(8457124);
		list.add(4124152);
		
		Comparator<Integer> comparator= new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				if(i % 1000000 > j % 1000000)
				{
					return -1;
				}
				return 0;
			}
		
		};
		
		Collections.sort(list,comparator);
		for (Integer integer : list) {
			System.out.println("list : "+list);
		}
		
	}
}
