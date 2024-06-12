package com.xworkz.wipro.things;

public interface Service {
	public void nameOfTeam();
	public String excecutive();
	public long contact();
	public boolean calling();
	public int emplyees();
	public short unit();
	public float amount();
	public char sequence();
	public byte noOfCalls();
	
	public static void calls() {
		System.out.println("This is calls from service interface");
	}
	default void tickets() {
		System.out.println("this is tickets from Service");
	}
}
