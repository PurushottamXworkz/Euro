class Spieces{
	
	public int noOfSpieces;
	public int priceOfSpieces;
	public String nameOfTheSpieces;
	
	public void setNoOfSpieces(int noOfSpieces){
		this.noOfSpieces=noOfSpieces;
	}
	
	public void setPriceOfSpieces(int priceOfSpieces){
		this.priceOfSpieces=priceOfSpieces;
	}
	
	public void setNameOfTheSpieces(String nameOfTheSpieces){
		this.nameOfTheSpieces=nameOfTheSpieces;
	}
	
	public int getNoOfSpieces(){
		System.out.println("total no of spieces are==="+noOfSpieces);
		return noOfSpieces;
	}
	
	public double getPriceOfSpieces(){
		System.out.println("price of masala is==="+priceOfSpieces);
		return priceOfSpieces;
	}
	
	public String getNameOfTheSpieces(){
		System.out.println("spiece name is==="+nameOfTheSpieces);
		return nameOfTheSpieces;
	}
	
}