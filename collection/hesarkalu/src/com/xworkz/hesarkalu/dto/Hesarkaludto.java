package com.xworkz.hesarkalu.dto;

public class Hesarkaludto {
	private String place;
	private int productions;
	private String quality;
	
	public Hesarkaludto(String place, int productions, String quality) {
		super();
		this.place = place;
		this.productions = productions;
		this.quality = quality;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getProductions() {
		return productions;
	}

	public void setProductions(int productions) {
		this.productions = productions;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	

}
