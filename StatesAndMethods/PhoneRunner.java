class PhoneRunner{
	public static void main(String args[]){
		Customer1 customer=new Customer1();
		Phone phone =new Phone("iPhone14","Austin",7485457485l);
		customer.detailsOfCustomer("Rakesh",7895457610l,phone);
		System.out.println("---------------------------------------");
		customer.detailsOfCustomer("Ramesh",9874547412l,phone);
	}
}