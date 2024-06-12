package com.xworkz.wipro.things;

public interface Applications {
		public void training();
		public String nameOfDrive();
		public long POC();
		public boolean isStarted();
		public int noOfEmplyees();
		public short storage();
		public float cost();
		public char edition();
		public byte limit();
		public double price();
		default void staff() {
			System.out.println("This is staff from Applications interface");
		}
		public static void resources() {
			System.out.println("This is resources from applications interface");
		}
		public static void cloudDepartment() {
			System.out.println("This is cloud department from applications");
		}
		
}
