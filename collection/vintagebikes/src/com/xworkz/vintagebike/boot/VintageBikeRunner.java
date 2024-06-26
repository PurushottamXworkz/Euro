package com.xworkz.vintagebike.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.vintagebike.dto.VintageBikedto;

public class VintageBikeRunner {
	public static void main(String[] args) {
		VintageBikedto dto=new VintageBikedto("Hero", "Metal", 123, 100000);
		VintageBikedto dto1=new VintageBikedto("Splender", "Metal", 321, 20000);
		VintageBikedto dto2=new VintageBikedto("HF-Delux", "Fiber", 213, 85000);
		VintageBikedto dto3=new VintageBikedto("RX", "Metal", 312, 450000);
		
		Collection<VintageBikedto> collection = new ArrayList<VintageBikedto>();
		
		System.out.println("Size "+collection.size());
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		System.out.println("Size "+collection.size());
		
		for (VintageBikedto vintageBikedto : collection) {
			System.out.println(vintageBikedto.getComponyName());
		}
		collection.remove(dto);
		for (VintageBikedto vintageBikedto : collection) {
			System.out.println(vintageBikedto.toString());
		}
		collection.clear();
		System.out.println(collection.size()); 
	}

}
