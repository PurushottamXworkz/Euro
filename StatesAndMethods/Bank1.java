class Bank1{
	public String nameOfBank;
	public String address;
	public Customer customer;
	
	public void detailsOfCustomer(String nameOfBank,String address,Customer customer){
		System.out.println("Bank Name : "+nameOfBank);
		System.out.println("Address : "+address);
		System.out.println("Customer Name :"+customer.customerName);
		System.out.println("Customer address :"+customer.address);
		System.out.println("Customer Phone Number :"+customer.phoneNumber);
		System.out.println("---------------------------------------------------------");
	}
	
}