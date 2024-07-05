package com.xworkz.grocery.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.grocery.dto.GroceryDto;

public class GroceryRunner {
	public static void main(String[] args) {
		GroceryDto dto2=new GroceryDto("Madakikaalu", 1, 120, "Medium");
		GroceryDto dto1=new GroceryDto("Avalakki", 2, 40, "Medium");
		GroceryDto dto4=new GroceryDto("Hesarkaalu", 1, 180, "Medium");
		GroceryDto dto3=new GroceryDto("Huralikaalu", 2, 145, "Medium");
		
		List<GroceryDto> dtos = new ArrayList<GroceryDto>();
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		
		Comparator<GroceryDto> comparator= new Comparator<GroceryDto>() {
			
			@Override
			public int compare(GroceryDto o1, GroceryDto o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				}
				return -1;
			}
		};
		
		Collections.sort(dtos,comparator);
		for (GroceryDto groceryDto : dtos) {
			System.out.println("Grocery dto :"+groceryDto);
		}
		
	}

}
