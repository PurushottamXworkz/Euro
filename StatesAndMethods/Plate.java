class Plate{
	public static String brandName="Clay craft";
	public static int price; 
	
	public static void nameOfPlate(String name){
		System.out.println("name of plate is "+brandName);
	}
	
	public static void priceOfPlate(){
		price=85;
		System.out.println("Price of plate is :"+price);
	}
	
	public static void main(String args[]){
		nameOfPlate("Eagleware");
		priceOfPlate();
	}
}