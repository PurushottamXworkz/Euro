class Customer{
	public String customerName;
	public String address;
	public long phoneNumber;
	
	public Customer(String customerName,String address,long phoneNumber){
		System.out.println("---------------------------------------------------------");
		System.out.println("Name of Customer : "+customerName+" Address :"+address+" Phone Number : "+phoneNumber);
		this.customerName=customerName;
		this.address=address;
		this.phoneNumber=phoneNumber;
		System.out.println("---------------------------------------------------------");
		//System.out.println("Name of Customer : "+this.customerName+" Address :"+this.address+"Phone Number : "+this.phoneNumber);
	}
}