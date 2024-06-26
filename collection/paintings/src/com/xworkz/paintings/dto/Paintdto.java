package com.xworkz.paintings.dto;

public class Paintdto {
	private String painterName;
	private int price;
	private String location;
	public Paintdto(String painterName, int price, String location) {
		super();
		this.painterName = painterName;
		this.price = price;
		this.location = location;
	}
	public String getPainterName() {
		return painterName;
	}
	public void setPainterName(String painterName) {
		this.painterName = painterName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
