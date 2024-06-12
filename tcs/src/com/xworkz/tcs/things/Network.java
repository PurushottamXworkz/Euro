package com.xworkz.tcs.things;

public interface Network {
		public String type="5G";
		public int noOfWires();
		public byte layers();
		public short value();
		public boolean connection();
		public long contact();
		default void invest() {
			System.out.println("This is invest from network");
		}
		public static void cloud() {
			System.out.println("This is cloud from network");
		}
}
