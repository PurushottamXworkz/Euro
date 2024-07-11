package com.xworkz.college.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRunner {
	public static void main(String[] args) {
		CollegeDto  collegeDto4=new CollegeDto("01fe21mca021", "Anirudh", 8099776752l);
		CollegeDto  collegeDto1=new CollegeDto("01fe21mca003", "Arav", 8099786652l);
		CollegeDto  collegeDto2=new CollegeDto("01fe21mca031", "Amar", 8099776222l);
		CollegeDto  collegeDto3=new CollegeDto("01fe21mca001", "Abhishek", 8099776152l);
		
		ArrayList<CollegeDto> list = new ArrayList<CollegeDto>();
		list.add(collegeDto4);
		list.add(collegeDto3);
		list.add(collegeDto2);
		list.add(collegeDto1);
		
		Comparator<CollegeDto> comparator = new Comparator<CollegeDto>() {
			
			@Override
			public int compare(CollegeDto o1, CollegeDto o2) {
				return o1.getsName().compareTo(o2.getsName());
			}
		};
		
		Collections.sort(list,comparator);
		
		
		for (CollegeDto collegeDto : list) {
			System.out.println("Sorted list : "+collegeDto);
		}
		
	}

}
