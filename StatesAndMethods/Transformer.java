class Transformer{
	public static String brandName="EVR Power";
	public static int price; 
	
	public static void nameOfTransformer(String name){
		System.out.println("name of transformer is "+brandName);
	}
	
	public static void priceOfTransformer(){
		price=65000;
		System.out.println("Price of transformer is :"+price);
	}
	
	public static void main(String args[]){
		nameOfTransformer("Siemans");
		priceOfTransformer();
	}
}