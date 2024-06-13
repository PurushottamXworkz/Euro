package com.xworkz.bike.boot;

import com.xworkz.bike.things.BikeThings;

public class BikeRunner {
	public static void main(String args[]) {
		BikeThings bike=new BikeThings();
		bike.save("Shantesh Honda", "Manju", "Bengalore", "Rajaji-Nagar", 7895412574l, 5, 9874854121l, 1006, 24, true);
	}
}
