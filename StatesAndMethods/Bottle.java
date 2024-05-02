class Bottle{
	static int priceOfBottle;
	static String brandOfBottle="Baily";
	
	public void setPriceOfBottle(int cost){
		priceOfBottle=cost;
	}
	
	public int getPriceOfBottle(){
		System.out.println("The price of tava is "+priceOfBottle);
		return priceOfBottle;
	}
	
	public void setbrandOfBottle(String brandBottle){
		brandOfBottle=brandBottle;
	}
	public void getBrandOfBottle(){
		System.out.println("The brand name of tava is "+brandOfBottle);
	}
	
	
}