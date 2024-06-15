package com.xworkz.benz.dto;

public class BenzDto {
	private String showRoomName;
	private String customerName;
	private String showRoomAddress;
	
	
	
	
	public BenzDto(String showRoomName, String customerName, String showRoomAddress) {
		super();
		this.showRoomName = showRoomName;
		this.customerName = customerName;
		this.showRoomAddress = showRoomAddress;
	}
	
	public BenzDto() {
		// TODO Auto-generated constructor stub
	}

	public String getShowRoomName() {
		System.out.println("Show room name "+showRoomName);
		return showRoomName;
	}


	public void setShowRoomName(String showRoomName) {
		this.showRoomName = showRoomName;
	}


	public String getCustomerName() {
		System.out.println("customer name "+customerName);
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getShowRoomAddress() {
		System.out.println("show Room Address "+showRoomAddress);
		return showRoomAddress;
	}


	public void setShowRoomAddress(String showRoomAddress) {
		this.showRoomAddress = showRoomAddress;
	}

	@Override
	public String toString() {
		return "BenzDto [showRoomName=" + showRoomName + ", customerName=" + customerName + ", showRoomAddress="
				+ showRoomAddress + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((showRoomAddress == null) ? 0 : showRoomAddress.hashCode());
		result = prime * result + ((showRoomName == null) ? 0 : showRoomName.hashCode());
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
		BenzDto other = (BenzDto) obj;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (showRoomAddress == null) {
			if (other.showRoomAddress != null)
				return false;
		} else if (!showRoomAddress.equals(other.showRoomAddress))
			return false;
		if (showRoomName == null) {
			if (other.showRoomName != null)
				return false;
		} else if (!showRoomName.equals(other.showRoomName))
			return false;
		return true;
	}


	
	
	
	
	
}
