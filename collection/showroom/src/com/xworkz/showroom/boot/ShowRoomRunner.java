package com.xworkz.showroom.boot;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.showroom.dto.ShowRoomDto;

public class ShowRoomRunner {
	public static void main(String[] args) {
		
		ShowRoomDto dto1=new ShowRoomDto("Neslon", "Hubli", 8745124155l, "Siddalinga");
		ShowRoomDto dto2=new ShowRoomDto("CBZ", "Gokul Hubli", 8745124120l, "Sarvesh");
		ShowRoomDto dto3=new ShowRoomDto("Enfield", "Haveri peth Hubli", 8745124185l, "Sangamesh");
		ShowRoomDto dto4=new ShowRoomDto("Apache", "Hale Bazar Hubli", 8745124174l, "Sunil");
		
		Set<ShowRoomDto> ref= new HashSet<ShowRoomDto>();
		ref.add(dto4);
		ref.add(dto3);
		ref.add(dto2);
		ref.add(dto1);
		System.out.println("Iterator size : "+ref.size());
		 Iterator<ShowRoomDto> iterator =ref.iterator();
		 
		 while (iterator.hasNext()) {
			ShowRoomDto showRoomDto =  iterator.next();
			
			iterator.remove();
			System.out.println("Iterator ="+iterator);
			
		}
		 System.out.println("Iterator size : "+ref.size());
		 
	}
}
