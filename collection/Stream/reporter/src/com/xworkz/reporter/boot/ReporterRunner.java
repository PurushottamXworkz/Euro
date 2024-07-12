package com.xworkz.reporter.boot;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.reporter.dto.ReporterDto;

public class ReporterRunner {
	public static void main(String[] args) {
		List<ReporterDto> list= Arrays.asList(new ReporterDto("Aparna", "Kannada Prabha", 14),
				new ReporterDto("Appanna", "Prabha News", 8),
				new ReporterDto("Annapoorna", "Crime Dairy", 55));
		
		List ref=list.stream().sorted(Comparator.comparing(ReporterDto -> ReporterDto.getNameOfReporter() )).collect(Collectors.toList());
		
		System.out.println("Sorted Name : "+ref);
	}

}
