package com.xworkz.workstation.boot;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.workstation.dto.WorkStationDto;

public class WorkStationRunner {
	public static void main(String[] args) {
		List<WorkStationDto> list = Arrays.asList(new WorkStationDto("New York",441 , "Western-US"),
				new WorkStationDto("California", 1542, "United States"),new WorkStationDto("London", 4102, "Englnd"),
				new WorkStationDto("Berlin", 125, "Germany"));
		
		List ref2 = list.stream().sorted(Comparator.comparing(workstationdto-> workstationdto.getState() )).collect(Collectors.toList());
		System.out.println("Sorted using state :"+ref2);
		
		List ref= list.stream().sorted(Comparator.comparingInt(workstationdto -> workstationdto.getNoOfComputers() )).collect(Collectors.toList());
		System.out.println("Sorting based on computers :"+ref);
	}
}
