package com.xworkz.asus.things;

public interface Computer extends Monitor {
	@Override
	default void qualityHD() {
		System.out.println("This is monitor interface HD quality");
	}
}
