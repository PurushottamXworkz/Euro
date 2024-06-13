package com.xworkz.bulero.things;

import com.xworkz.bulero.dto.BuleroDto;

public class BuleroThings {

	public void save(String customerAddress, String string, String string2, String string3, long l, int i, long m, int j, int k, boolean b) {
			
		BuleroDto dto=new BulroDto();
		
		dto.setShowRoomName(customerAddress);
		dto.setCustomerName(customerName);
		dto.setShowRoomAddress(customerAddress);
		dto.setCustomerAddress(customerAddress);
		dto.setCustomerNumber(customerNumber);
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
