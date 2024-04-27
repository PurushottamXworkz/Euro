class RodsRunner{
	public static void main(String args[]){
		Rods infoOfRods=new Rods();
		System.out.println("The number of rods are : "+infoOfRods.rodsNumber);
		System.out.println("The thickness of all rods : "+infoOfRods.allRodsThickness);
		System.out.println("Contact for Rods : "+infoOfRods.contactForRods);
		System.out.println("Type of Rods : "+infoOfRods.typeOfRods);
		System.out.println("Rods available in store : "+infoOfRods.rodsPresent);
		System.out.println("name of Roads : "+infoOfRods.nameOfrods);	
		infoOfRods.addCustomer();
		infoOfRods.updateCutomer();
		infoOfRods.deleteCustomer();
	}
}