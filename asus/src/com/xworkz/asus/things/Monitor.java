package com.xworkz.asus.things;

public interface Monitor {
		public void size();
		default void qualityHD() {
			System.out.println("This is monitor interface HD quality");
		}
		public static void power() {
			System.out.println("This is monitor interface power");
		}
}
