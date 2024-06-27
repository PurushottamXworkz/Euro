package com.xworkz.automobiles.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.automobiles.dto.AutomobileDto;
import com.xworkz.retrocars.dto.RetrocarsDto;

public class AutomobileRunner {
	public static void main(String[] args) {
		AutomobileDto automobileDto = new AutomobileDto("spring", "Raghu automobiles", 270);
		AutomobileDto automobileDto2 = new AutomobileDto("Wheel", "Star automobiles", 1500);
		AutomobileDto automobileDto3 = new AutomobileDto("Oil", "Gaytri automobiles", 680);
		AutomobileDto automobileDto4 = new AutomobileDto("center stand", "Ram automobiles", 5000);
		
		
		Collection<AutomobileDto> collection =new ArrayList<AutomobileDto>();
		collection.add(automobileDto);
		collection.add(automobileDto2);
		collection.add(automobileDto3);
		collection.add(automobileDto4);
		
		System.out.println(collection.size());
		
		System.out.println("Automobile dto :"+collection.containsAll(collection)); 
		
		for (AutomobileDto automobileDto5 : collection) {
			System.out.println(automobileDto5.toString());
		}
		
		collection.remove(automobileDto);
		collection.remove(automobileDto2);
		collection.remove(automobileDto3);
		
		System.out.println(collection.size());
		
		for (AutomobileDto automobileDto5 : collection) {
			System.out.println(automobileDto5.toString());
		}
		
		System.out.println("Automobile dto :"+collection.contains(automobileDto)); 
		
	}
}
