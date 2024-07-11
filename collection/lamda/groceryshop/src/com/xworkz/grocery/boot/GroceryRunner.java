package com.xworkz.grocery.boot;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroceryRunner {
	 public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,31,8,123,764,99,1);
		list.forEach(n -> System.out.println("The array value : "+n));
		list.stream().sorted().filter( n-> n % 2 == 0).forEach(n ->  System.out.println("Array : "+n));
		
		List<String> list2=Arrays.asList("Table","Zebra","Kangaro","Lion");
		list2.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("List 2 : "+list2);
		List ref1=	list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("List reverse "+ref1);
	}
}
