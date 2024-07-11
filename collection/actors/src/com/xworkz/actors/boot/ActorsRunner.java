package com.xworkz.actors.boot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.xworkz.actors.dto.ActorsDto;

public class ActorsRunner {
	public static void main(String[] args) {
		ActorsDto actorsDto1 = new ActorsDto("RajKumar", 8741021077l, "Kannappa");
		ActorsDto actorsDto2 = new ActorsDto("Ramesh", 8741054077l, "Prema");
		ActorsDto actorsDto3 = new ActorsDto("Sudeep", 8781021077l, "Tayavva");
		ActorsDto actorsDto4 = new ActorsDto("ShivRajKumar", 8841021077l, "Anand");
		
		ArrayList<ActorsDto> actorsDtos = new ArrayList<ActorsDto>();
		actorsDtos.add(actorsDto2);
		actorsDtos.add(actorsDto1);
		actorsDtos.add(actorsDto4);
		actorsDtos.add(actorsDto3);
		
		Comparator<ActorsDto> comparator = new Comparator<ActorsDto>() {
			
			@Override
			public int compare(ActorsDto o1, ActorsDto o2) {
				
				return o1.getDebue().compareTo(o2.getDebue());
			}
		};
		
		Collections.sort(actorsDtos,comparator);
		
		for (ActorsDto actorsDto : actorsDtos) {
			System.out.println("Actors in sorted : "+actorsDto);
		}
	}
}
