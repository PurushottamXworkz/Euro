package com.xworkz.house.boot;

import com.xworkz.house.childclasses.BedRooms;
import com.xworkz.house.childclasses.Hall;

public class HouseRunner {
	public static void main(String args[]) {
		Hall hall=new Hall();
		BedRooms bed=new BedRooms();
		
		hall.hallLength();
		hall.noOfArchs();
		hall.showCase();
		System.out.println(bed.isMasterBedrrom);
		bed.noOfArchs();
		bed.noOfArchs();
		bed.hallLength();
		bed.noOfMirros();
		
	}
}
