package com.xworkz.tcs.things;

public interface Cyber {
	public String data="Data leak";
	public int attempts();
	public byte security();
	public short sequence();
	public boolean vpnNetwork();
	public double values();
	default void attach() {
		System.out.println("This is invest from network");
	}
}
