class Charger{
	public static String brandName="Car Mobile Chargers";
	public static int price; 
	
	public static void nameOfCharger(String name){
		System.out.println("name of charger is "+brandName);
	}
	
	public static void priceOfCharger(){
		price=895;
		System.out.println("Price of charger is :"+price);
	}
	
	public static void main(String args[]){
		nameOfCharger("Samsung 45W");
		priceOfCharger();
	}
}