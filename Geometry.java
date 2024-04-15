class Geometry{
	public static void main(String args[]){
		int noOfPrism=22;
		String nameOfPrism="Cuboid";
		int facesOfprism=6;
		if(noOfPrism!=20 && nameOfPrism!="Cuboid" && facesOfprism==6){
			System.out.println("The condition is in IF statement");
		}
		else{
			System.out.println("The condition is in ELSE statement");
		}
		if(nameOfPrism=="Pentagonal" && facesOfprism==6){
			System.out.println("The condition is in IF statement");
		}
		else{
			System.out.println("The condition is in ELSE statement");
		}
	}
}