package com.xworkz.van.dto;

public class VanDto {
	private String vanName;
	private int vanNumber;
	private String ownerName;
	
	public VanDto(String vanName, int vanNumber, String ownerName) {
		super();
		this.vanName = vanName;
		this.vanNumber = vanNumber;
		this.ownerName = ownerName;
	}

	public String getVanName() {
		return vanName;
	}

	public void setVanName(String vanName) {
		this.vanName = vanName;
	}

	public int getVanNumber() {
		return vanNumber;
	}

	public void setVanNumber(int vanNumber) {
		this.vanNumber = vanNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		result = prime * result + ((vanName == null) ? 0 : vanName.hashCode());
		result = prime * result + vanNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VanDto other = (VanDto) obj;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		if (vanName == null) {
			if (other.vanName != null)
				return false;
		} else if (!vanName.equals(other.vanName))
			return false;
		if (vanNumber != other.vanNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VanDto [vanName=" + vanName + ", vanNumber=" + vanNumber + ", ownerName=" + ownerName + "]";
	}
	
	
	
	
}
