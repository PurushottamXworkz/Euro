class PrimeMinister{
	public String nameOfPrimeMinister;
	public Securities noOfSecurities;
	
	public void pmDetails(String nameOfPrimeMinister,int noOfSecurities){
		System.out.println("The name of prime Minister is :"+nameOfPrimeMinister);
		System.out.println("The number of securies to PM is :"+Securities.noOfSecurities);
	
	System.out.println("-----------------------------------------------");
	
	this.nameOfPrimeMinister=nameOfPrimeMinister;
	this.noOfSecurities=noOfSecurities;
	
	System.out.println("The name of prime Minister is :"+this.nameOfPrimeMinister);
		System.out.println("The number of securies to PM is :"+this.Securities.noOfSecurities);
	}
}	