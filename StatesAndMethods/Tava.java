class Tava{
	static int priceOfTava;
	static String brandOfTava="Prestige";
	boolean stockofTavaisPresent=true;
	
	public void setPriceOfTava(int cost){
		priceOfTava=cost;
	}
	
	public int getPriceOfTava(){
		System.out.println("The price of tava is "+priceOfTava);
		return priceOfTava;
	}
	
	public void setbrandOfTava(String brandTava){
		brandOfTava=brandTava;
	}
	public void getBrandOfTava(){
		System.out.println("The brand name of tava is "+brandOfTava);
	}
	
}





