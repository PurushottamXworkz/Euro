class Radio{
	public static String brandName="Caravan";
	public static int price; 
	
	public static void name(String nameOfRadio){
		System.out.println("name of Radio is "+brandName);
	}
	
	public static void priceOfRadio(){
		price=1452;
		System.out.println("Price of radio is :"+price);
	}
	
	public static void main(String args[]){
		name("Kqud");
		priceOfRadio();
	}
}