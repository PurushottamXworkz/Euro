class Dish{
	public static void main(String args[]){
		int noOfDishes=20;
		String nameOfDish="Vada";
		
		if(noOfDishes==20 && nameOfDish=="Vada"){
			System.out.println("The Dish is present this is AND condition");
		}
		else{
			System.out.println("Dish is not present this is AND condition");
		}
		
		if(noOfDishes==0 || nameOfDish=="Vada"){
		System.out.println("The Dish is present this is OR condition");	
		}
		else{
			System.out.println("Dish is not present this is OR condition");
		}
		
	}
}