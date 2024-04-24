class ShipRunner{
	public static void main(String args[]){
		int [] shipNumbers={220,1144,6457,87456,113799};
		int [] valuesOfShip=Ship.noOfShip(shipNumbers);
		
		for(int values:valuesOfShip){
			System.out.println("Ship numbers : "+values);
		}
		
		String[] nameOfMember=Ship.membersName();
		
		for(String values1:nameOfMember){
			
			System.out.println("The name of the ship members : "+values1);
		}
	}
}