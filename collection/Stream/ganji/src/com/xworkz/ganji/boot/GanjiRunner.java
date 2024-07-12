package com.xworkz.ganji.boot;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.ganji.dto.GanjiDto;

public class GanjiRunner {
	public static void main(String[] args) {
		List<GanjiDto> list = Arrays.asList(new GanjiDto("Rava", 3),
				new GanjiDto("Akki", 2),
				new GanjiDto("Mente", 5));
		
		List ref= list.stream().sorted(Comparator.comparing(GanjiDto -> GanjiDto.getName())).collect(Collectors.toList());
		System.out.println("Sorted Names"+ref);
	}
}
