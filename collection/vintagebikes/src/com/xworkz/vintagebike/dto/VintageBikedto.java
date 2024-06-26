package com.xworkz.vintagebike.dto;

public class VintageBikedto {
	private String componyName;
	private String body;
	private int version;
	private int price;
	
	public VintageBikedto(String componyName, String body, int version, int price) {
		super();
		this.componyName = componyName;
		this.body = body;
		this.version = version;
		this.price = price;
	}

	public String getComponyName() {
		return componyName;
	}

	public void setComponyName(String componyName) {
		this.componyName = componyName;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	} 
	
}
