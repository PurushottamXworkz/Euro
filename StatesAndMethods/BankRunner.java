class BankRunner{
	public static void main(String args[]){
		Bank infoOFBank=new Bank();
		System.out.println("The Number of customers are : "+infoOFBank.noOfCustomers);
		System.out.println("The Transaction amount of bank is : "+infoOFBank.trasactionAmt);
		System.out.println("The Total value of Bank is : "+infoOFBank.totalValue);
		System.out.println("The Type of bank is : "+infoOFBank.typeOfBank);
		System.out.println("The Name of Bank is : "+infoOFBank.nameOfBank);
		System.out.println("The Contact  number is : "+infoOFBank.contactNum);
		System.out.println("The Bank is open or not : "+infoOFBank.isBankOpen);
		infoOFBank.addCustomer();
		infoOFBank.updateCustomer();
		infoOFBank.deleteCustomer();
	}
}