class Gun{
	static int noOfGuns;
	public static void gunsInNumber(){
		noOfGuns=1000;
		System.out.println("Number of guns in gunsInNumber method: "+noOfGuns);
		gunDetails();
	}
	
	public static void gunDetails(){
		System.out.println("This is gunDetails method");
		noOfGuns=28;
		System.out.println("This is gunDetails method : "+noOfGuns);
	}
}