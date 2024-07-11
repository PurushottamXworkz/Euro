package com.xworkz.monuments.dto;

public class MonumentsDto {
	private String placeName;
	private String dynasty;
	private String reasonForDeclaring;
	
	public MonumentsDto(String placeName, String dynasty, String reasonForDeclaring) {
		super();
		this.placeName = placeName;
		this.dynasty = dynasty;
		this.reasonForDeclaring = reasonForDeclaring;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getDynasty() {
		return dynasty;
	}

	public void setDynasty(String dynasty) {
		this.dynasty = dynasty;
	}

	public String getReasonForDeclaring() {
		return reasonForDeclaring;
	}

	public void setReasonForDeclaring(String reasonForDeclaring) {
		this.reasonForDeclaring = reasonForDeclaring;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dynasty == null) ? 0 : dynasty.hashCode());
		result = prime * result + ((placeName == null) ? 0 : placeName.hashCode());
		result = prime * result + ((reasonForDeclaring == null) ? 0 : reasonForDeclaring.hashCode());
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
		MonumentsDto other = (MonumentsDto) obj;
		if (dynasty == null) {
			if (other.dynasty != null)
				return false;
		} else if (!dynasty.equals(other.dynasty))
			return false;
		if (placeName == null) {
			if (other.placeName != null)
				return false;
		} else if (!placeName.equals(other.placeName))
			return false;
		if (reasonForDeclaring == null) {
			if (other.reasonForDeclaring != null)
				return false;
		} else if (!reasonForDeclaring.equals(other.reasonForDeclaring))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MonumentsDto [placeName=" + placeName + ", dynasty=" + dynasty + ", reasonForDeclaring="
				+ reasonForDeclaring + "]";
	}
	
	
	
	
}
