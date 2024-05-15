class Customer1{
	public String customerName;
	public long customerContact;
	public Phone phone;
	
	public void detailsOfCustomer(String customerName,long customerContact,Phone phone){
		System.out.println("Customer Name :"+customerName);
		System.out.println("Customer Contact :"+customerContact);
		System.out.println("Name Of Phone :"+phone.nameOfPhone);
		System.out.println("Adress of Phone Shop: "+phone.address);
		System.out.println("Contact for Phone :"+phone.contact);
	}
}