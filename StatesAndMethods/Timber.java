class Timber{
	public String typeOfTimber;
	public float amount;
	public Furniture furniture;
	
	public void detailsOfFurniture(String typeOfTimber,float amount,Furniture furniture){
		System.out.println("Type of Furniture :"+typeOfTimber);
		System.out.println("Amount of Furniture :"+amount);
		System.out.println("Name Of Furniture :"+furniture.nameOfFurniture);
		System.out.println("Location of Furniture :"+furniture.location);
		System.out.println("Contact for Furniture :"+furniture.contactNumber);
		System.out.println("------------------------------------------------------");
	}
}