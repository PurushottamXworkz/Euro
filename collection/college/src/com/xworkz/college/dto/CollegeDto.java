package com.xworkz.college.dto;

public class CollegeDto {
	
	private String USN;
	private String sName;
	private long conact;
	
	
	public CollegeDto(String uSN, String sName, long conact) {
		super();
		USN = uSN;
		this.sName = sName;
		this.conact = conact;
	}


	public String getUSN() {
		return USN;
	}


	public void setUSN(String uSN) {
		USN = uSN;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public long getConact() {
		return conact;
	}


	public void setConact(long conact) {
		this.conact = conact;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((USN == null) ? 0 : USN.hashCode());
		result = prime * result + (int) (conact ^ (conact >>> 32));
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
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
		CollegeDto other = (CollegeDto) obj;
		if (USN == null) {
			if (other.USN != null)
				return false;
		} else if (!USN.equals(other.USN))
			return false;
		if (conact != other.conact)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CollegeDto [USN=" + USN + ", sName=" + sName + ", conact=" + conact + "]";
	}
	
	
	
	
}
