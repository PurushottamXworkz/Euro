class CustomerRunner{
	public static void main(String args[]){
		Bank1 bank=new Bank1();
		Customer customer=new Customer("Rajesh","kalyan Nagar",8454745210l);
		bank.detailsOfCustomer("State Bank Of India","Kalyan Nagar",customer);
		Customer customer1=new Customer("RajKapoor","Bandra",7845147599l);
		bank.detailsOfCustomer("State Bank Of India","Kalyan Nagar",customer1);
	}
}