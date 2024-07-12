package com.xworkz.van.boot;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.van.dto.VanDto;

public class VanRunner {
	public static void main(String[] args) {
		List<VanDto> list = Arrays.asList(new VanDto("Omini", 4541, "Ramu"), new VanDto("Bulero",1240 , "Singh"),
				new VanDto("Thar", 7841, "Dharma"),new VanDto("Scorpio", 7221, "Yogi"));
		
		list.stream().sorted(Comparator.comparing(vandto-> vandto.getOwnerName() )).collect(Collectors.toList());
		
		System.out.println(list);
		
		List ref1=	list.stream().sorted(Comparator.comparingInt(vandto-> vandto.getVanNumber())).collect(Collectors.toList());
		
		System.out.println(ref1);
		
	}
}
