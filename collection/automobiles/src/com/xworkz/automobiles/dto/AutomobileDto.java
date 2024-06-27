package com.xworkz.automobiles.dto;

public class AutomobileDto {
	private String spareName;
	private String shopName;
	private int cost;
	
	public AutomobileDto(String spareName, String shopName, int cost) {
		super();
		this.spareName = spareName;
		this.shopName = shopName;
		this.cost = cost;
	}

	public String getSpareName() {
		return spareName;
	}

	public void setSpareName(String spareName) {
		this.spareName = spareName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "AutomobileDto [spareName=" + spareName + ", shopName=" + shopName + ", cost=" + cost + "]";
	}
	
}
