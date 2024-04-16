class Bed{
	static int noOfBeds=4;
	
	public static void getDetails(){
		boolean vaccantBeds=true;
		System.out.println("Number of Beds : "+noOfBeds);
		getInformation();
		System.out.println("Vaccant beds : "+vaccantBeds);
	}
	public static void getInformation(){
		String bedOwnername="RAJ";
		System.out.println("bed Owner name : "+bedOwnername);
	}
	
}