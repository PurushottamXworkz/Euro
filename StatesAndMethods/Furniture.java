class Furniture{
	public String nameOfFurniture;
	public String location;
	public long contactNumber;
	
	public Furniture(String nameOfFurniture,String location,long contactNumber){
		System.out.println("----------------------------------------------------");
		System.out.println("Name of Furniture :"+nameOfFurniture+" Location of Shop :"+location+" Contact Number :"+contactNumber);
		this.nameOfFurniture=nameOfFurniture;
		this.location=location;
		this.contactNumber=contactNumber;
		System.out.println("----------------------------------------------------------------");
		System.out.println("Name of Furniture :"+this.nameOfFurniture+" Location of Shop :"+this.location+" Contact Number :"+this.contactNumber);	
	}
}