package com.xworkz.retrocars.boot;

import java.util.ArrayList;
import java.util.Collection;
import com.xworkz.retrocars.dto.RetrocarsDto;

public class RetroclassRunner {
	public static void main(String[] args) {
		RetrocarsDto retrocarsDto = new RetrocarsDto("1932 Ford Roadster", "Model A", 20000);
		RetrocarsDto retrocarsDto2 = new RetrocarsDto("WW Beetle", "A1 Model", 40000);
		RetrocarsDto retrocarsDto3 = new RetrocarsDto("Aston Martin DB4", "AMG Hammer", 4500);
		RetrocarsDto retrocarsDto4 = new RetrocarsDto("Corvette", "Dual Made", 5000);
		RetrocarsDto retrocarsDto5 = new RetrocarsDto("MCLaren", "F1 model", 28000);
		
		Collection<RetrocarsDto> collection=new ArrayList<RetrocarsDto>();
		
		collection.add(retrocarsDto);
		collection.add(retrocarsDto2);
		collection.add(retrocarsDto3);
		collection.add(retrocarsDto4);
		collection.add(retrocarsDto5);
		System.out.println(collection.size());
		
		System.out.println("Retro car dto :"+collection.containsAll(collection)); 
		
		for (RetrocarsDto retrocarsDto6 : collection) {
			System.out.println(retrocarsDto6.toString());
		}
		
		collection.remove(retrocarsDto4);
		collection.remove(retrocarsDto5);
		collection.remove(retrocarsDto3);
		
		System.out.println(collection.size());
		
		for (RetrocarsDto retrocarsDto6 : collection) {
			System.out.println(retrocarsDto6.toString());
		}
		
		System.out.println("Retro car dto :"+collection.contains(retrocarsDto3)); 
		
//		Iterator<RetrocarsDto> iterator = new ArrayList<RetrocarsDto>(); 
//			for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
//				RetrocarsDto retrocarsDto5 = iterator.next();	
//		
//		};
		
		
	}
}
