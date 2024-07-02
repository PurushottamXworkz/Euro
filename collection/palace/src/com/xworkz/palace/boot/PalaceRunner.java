package com.xworkz.palace.boot;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class PalaceRunner {
	public static void main(String[] args) {
		String name="Ram";
		String name2="Shyam";
		String name3="Karna";
		String name4="Bhishma";
		
		List<String> list =new LinkedList<String>();
		list.add(name);
		list.add(name2);
		list.add(name3);
		list.add(name4);
		list.add(name);
		
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Set<String> set =new HashSet<String>();
		set.add(name);
		set.add(name2);
		set.add(name3);
		set.add(name4);
		set.add(name);
		
		System.out.println(set);
		
	}

}
