package com.xworkz.movies.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.xworkz.movies.dto.MoviesDto;

public class MoviesRunner {
	public static void main(String[] args) {
		MoviesDto dto1= new MoviesDto("Bangarada Manushya", 1973, "Raj");
		MoviesDto dto2= new MoviesDto("Akash", 2001, "Punit");
		MoviesDto dto3= new MoviesDto("Arundati", 2010, "Anushka");
		MoviesDto dto4= new MoviesDto("Mirchi", 2013, "Prabhas");
		
		ArrayList<MoviesDto> arrayList= new ArrayList<MoviesDto>();
		arrayList.add(dto1);
		arrayList.add(dto2);
		arrayList.add(dto3);
		arrayList.add(dto4);
		
		Comparator<MoviesDto> comparator = new Comparator<MoviesDto>() {
			
			@Override
			public int compare(MoviesDto o1, MoviesDto o2) {
				return o1.getCastName().compareTo(o2.getCastName());
			}
		};
		
		Collections.sort(arrayList,comparator);
		
		for (MoviesDto moviesDto : arrayList) {
			System.out.println("Soterd DTO :"+moviesDto);
		}
		
	}
}
