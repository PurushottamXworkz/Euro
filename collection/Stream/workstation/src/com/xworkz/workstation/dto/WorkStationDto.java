package com.xworkz.workstation.dto;

public class WorkStationDto {
	private String place;
	private int noOfComputers;
	private String state;
	
	public WorkStationDto(String place, int noOfComputers, String state) {
		super();
		this.place = place;
		this.noOfComputers = noOfComputers;
		this.state = state;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getNoOfComputers() {
		return noOfComputers;
	}

	public void setNoOfComputers(int noOfComputers) {
		this.noOfComputers = noOfComputers;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfComputers;
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		WorkStationDto other = (WorkStationDto) obj;
		if (noOfComputers != other.noOfComputers)
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "place=" + place + ", noOfComputers=" + noOfComputers + ", state=" + state + "";
	}
	
	
	
	
}
