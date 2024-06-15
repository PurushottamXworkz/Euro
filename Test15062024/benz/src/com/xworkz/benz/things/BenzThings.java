package com.xworkz.benz.things;

import com.xworkz.benz.dto.BenzDto;

public class BenzThings {
	
	public void save(String showRoomName,
	 String customerName,
	 String showRoomAddress) {
		BenzDto dto=new BenzDto();
		
		
		
		dto.setShowRoomName(showRoomName);
		dto.setCustomerName(customerName);
		dto.setShowRoomAddress(showRoomAddress);
		
		dto.getShowRoomName();
		dto.getCustomerName();
		dto.getShowRoomAddress();
		
	}

}
