class GramaPhone{
	public static String brandName="Nad electronics";
	public static int price; 
	
	public static void nameOfGramaphone(String name){
		System.out.println("name of Gramahone is "+brandName);
	}
	
	public static void priceOfGramaphone(){
		price=7412;
		System.out.println("Price of Gramaphone is :"+price);
	}
	
	public static void main(String args[]){
		nameOfGramaphone("Dual");
		priceOfGramaphone();
	}
}