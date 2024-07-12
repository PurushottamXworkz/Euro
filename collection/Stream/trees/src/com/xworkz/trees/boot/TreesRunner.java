package com.xworkz.trees.boot;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.trees.dto.TreesDto;

public class TreesRunner {
	public static void main(String[] args) {
		List<TreesDto> dtos = Arrays.asList(new TreesDto("Pine Tree", 140),
				new TreesDto("Fir Tree", 741),new TreesDto("Apple Tree", 25),
				new TreesDto("Maple Tree", 451));
		
		List ref=dtos.stream().sorted(Comparator.comparingInt(TreesDto -> TreesDto.getNoOfTrees() )).collect(Collectors.toList());
		
		System.out.println("Sorted based on Name :"+ref);
	}
}
