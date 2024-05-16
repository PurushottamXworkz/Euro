class Towel{
	public static String brandName="Trind";
	public static int price; 
	
	public static void nameOfTowel(String name){
		System.out.println("name of Towel is "+brandName);
	}
	
	public static void priceOfTowel(){
		price=85;
		System.out.println("Price of Towel is :"+price);
	}
	
	public static void main(String args[]){
		nameOfTowel("Jockey");
		priceOfTowel();
	}
}