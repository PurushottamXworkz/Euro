package com.xworkz.grocery.dto;


public class GroceryDto {
	
	private String cerils;
	private int kg;
	private int price;
	private String quality;
	
	public GroceryDto(String cerils, int kg, int price, String quality) {
		super();
		this.cerils = cerils;
		this.kg = kg;
		this.price = price;
		this.quality = quality;
	}

	

	public String getCerils() {
		return cerils;
	}


	public void setCerils(String cerils) {
		this.cerils = cerils;
	}


	public int getKg() {
		return kg;
	}


	public void setKg(int kg) {
		this.kg = kg;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getQuality() {
		return quality;
	}


	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	@Override
	public String toString() {
		return "GroceryDto [cerils=" + cerils + ", kg=" + kg + ", price=" + price + ", quality=" + quality + "]";
	}
}
