package com.xworkz.grocery.boot;

import java.util.Arrays;
import java.util.List;

public class GroceryRunner {
	 public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,31,8,123,764,99,1);
		list.forEach(n -> System.out.println("The array value : "+n));
		list.stream().sorted().filter( n-> n % 2 == 0).forEach(n ->  System.out.println("Array : "+n));
	}
}
