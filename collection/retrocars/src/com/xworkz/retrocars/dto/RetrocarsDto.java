package com.xworkz.retrocars.dto;

public class RetrocarsDto {
	private String name;
	private String model;
	private int cost;
	
	public RetrocarsDto(String name, String model, int cost) {
		super();
		this.name = name;
		this.model = model;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "RetrocarsDto [name=" + name + ", model=" + model + ", cost=" + cost + "]";
	}
	
	
	

}
