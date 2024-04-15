class Drinks{
	public static void main(String args[]){
		int noOfDrinks=24;
		String nameOfDrink="AppleJuice";
		boolean availability=true;
		if(noOfDrinks==24 || nameOfDrink== "AppleJuice" ||availability==true ){
			System.out.println("This is in If Statement");
		}
		else{
			System.out.println("This is in else Statement");
		}
		if(noOfDrinks!=12 || nameOfDrink!= "Juice" || availability==false){
			System.out.println("This is in If Statement");
		}
		else{
			System.out.println("This is in else Statement");
		}
	}
}