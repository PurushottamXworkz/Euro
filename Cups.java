class Cups{
	public static void main(String args[]){
		int noOfCups=10;
		String colourOfCup="White";
		boolean avilable=true;
		if(noOfCups==10 || colourOfCup=="Black" || avilable==true){
			System.out.println("It is in IF statement");
		}
		else{
			System.out.println("It is in ELSE statement");
		}
		if(noOfCups!=10 || colourOfCup!="White" || avilable!=true){
			System.out.println("It is in IF statement");
		}
		else{
			System.out.println("It is in ELSE statement");
		}
	}
}