class ShirtRunner{
	public static void main(String args[]){
		int[] cost=Shirt.costOfShirt();
		for(int i=0;i<cost.length;i++){
			System.out.println("Cost of shirts : "+cost[i]);
		}
		
		char [] size=Shirt.shirtSize();
		for(char sizeOfShirt:size){
			System.out.println("Cost of ballons are : "+sizeOfShirt);
		}
	}
}