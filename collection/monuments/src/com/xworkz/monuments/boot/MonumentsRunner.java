package com.xworkz.monuments.boot;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.monuments.dto.MonumentsDto;

public class MonumentsRunner {
	public static void main(String[] args) {
		MonumentsDto dto1 = new MonumentsDto("Belagola", "Chalukya", "Monument of gommata");
		MonumentsDto dto2 = new MonumentsDto("Hampi", "Aravidu", "Iconic Temples");
		MonumentsDto dto3 = new MonumentsDto("Mysore", "Wodeyar", "Iconic Palace");
		MonumentsDto dto4 = new MonumentsDto("RayGadh", "Peshwa", "Killa");
		
		List<MonumentsDto> dtos = new ArrayList<MonumentsDto>();
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		
		Comparator<MonumentsDto> comparator = new Comparator<MonumentsDto>() {
			
			@Override
			public int compare(MonumentsDto o1, MonumentsDto o2) {
				return o1.getReasonForDeclaring().compareTo(o2.getReasonForDeclaring());
			}
		};
		
		Collections.sort(dtos,comparator);
		
		for (MonumentsDto monumentsDto : dtos) {
			System.out.println("Sorted list : "+monumentsDto);
		}
	}
}
