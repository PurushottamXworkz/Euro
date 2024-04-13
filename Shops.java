class Shops{
	public static void main(String args[]){
		
		byte noOfShops=74;
		short sizeOfShop=600;
		int valueOfShop=1000;
		float lengthOfShop=4875.124f;
		double shopNumber=14528412;
		long contactOfMobile=8088445520l;
		boolean theShopIsOpen=true;
		char registerNameOfShop='R';
		String nameOfShop="Asian-Paints";
		 
		 
		 
		if(noOfShops<=74){
			System.out.println("Number Of Shops: "+noOfShops);
		}
		else{
			System.out.println("Number Of Shops are not valid");
		}
		
		if(sizeOfShop==600){
			System.out.println("Shop size is correct "+sizeOfShop);
		}
		else{
			System.out.println("Shop size is invalid: "+sizeOfShop);
		}
		
		
		if(valueOfShop<=2000){
			System.out.println("Shop value is valid: "+valueOfShop);
		}
		else{
			System.out.println("Shop value is in valid: "+valueOfShop);
		}
		
		if(lengthOfShop<=500){
			System.out.println("Shop length is valid: "+lengthOfShop);
		}
		else{
			System.out.println("Shop length is invalid: "+lengthOfShop);
		}
		
		if(shopNumber==14528412){
			System.out.println("Shop number is valid: "+shopNumber);
		}
		else{
			System.out.println("Shop number is invalid: "+shopNumber);
		}
		
		if(contactOfMobile==8088445520l){
			System.out.println("The mobile contact is correct : "+contactOfMobile);
		}
		else{
			System.out.println("The contact number is not valid : "+contactOfMobile);
		}
		
		if(theShopIsOpen==true){
			System.out.println("The shop is Open : "+theShopIsOpen);
		}
		else{
			System.out.println("The shop is closed : "+theShopIsOpen);
		}
		
		if(registerNameOfShop=='R'){
			System.out.println("Register Name Of Shop : "+registerNameOfShop);
		}
		else{
			System.out.println("Register Name Of Shop is diffent : "+registerNameOfShop);
		}
		
		if(nameOfShop=="Asian-Paints"){
			System.out.println("Name Of Shop is : "+nameOfShop);
		}
		else{
			System.out.println("Name Of Shop is : "+nameOfShop);
		}
	}
}