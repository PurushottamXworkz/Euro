package com.xrorkz.microsoft.things;

import com.xrorkz.microsoft.dto.MicrosoftDto;

public class MicrosoftThings {
	public void save(String showRoomName,String customerName,String showRoomAddress,String customerAddress,
			long customerNumber,int totalBrands,long showRoomContact, int noOfCustomers,int totalStaff,boolean ifDataValid) {
			
		MicrosoftDto dto=new MicrosoftDto();
		
		dto.setShowRoomName(customerAddress);
		dto.setCustomerName(customerAddress);
		dto.setShowRoomAddress(customerAddress);
		dto.setCustomerAddress(customerAddress);
		dto.setCustomerNumber(showRoomContact);
		dto.setTotalBrands(totalStaff);
		dto.setShowRoomContact(showRoomContact);
		dto.setNoOfCustomers(totalStaff);
		dto.setTotalStaff(totalStaff);
		dto.setIfDataValid(ifDataValid);
		
		dto.getShowRoomName();
		dto.getCustomerName();
		dto.getShowRoomAddress();
		dto.getCustomerAddress();
		dto.getCustomerNumber();
		dto.getTotalBrands();
		dto.getShowRoomContact();
		dto.getNoOfCustomers();
		dto.getTotalStaff();
		dto.isIfDataValid();
		
		
	}

}
