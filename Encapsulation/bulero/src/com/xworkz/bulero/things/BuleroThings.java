package com.xworkz.bulero.things;

import com.xworkz.bulero.dto.BuleroDto;

public class BuleroThings {

	public void save(String showRoomName,String customerName,String showRoomAddress,String customerAddress,
			long customerNumber,int totalBrands,long showRoomContact, int noOfCustomers,int totalStaff,boolean ifDataValid) {
			
		BuleroDto dto=new BuleroDto();
		
		
		dto.setShowRoomName(customerAddress);
		dto.setCustomerName(customerAddress);
		dto.setShowRoomAddress(customerAddress);
		dto.setCustomerAddress(customerAddress);
		dto.setCustomerNumber(showRoomContact);
		dto.setTotalBrands(totalStaff);
		
		dto.setNoOfCustomers(totalStaff);
		dto.setTotalStaff(totalStaff);
		dto.setIfDataValid(ifDataValid);
		
		dto.getShowRoomName();
		dto.getCustomerName();
		dto.getShowRoomAddress();
		dto.getCustomerAddress();
		dto.getCustomerNumber();
		dto.getTotalBrands();
		dto.getNoOfCustomers();
		dto.getTotalStaff();
		dto.isIfDataValid();
		
	}
}
