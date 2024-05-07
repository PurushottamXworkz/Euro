class Home{
	int noOfMembers=1000;
	String nameOfFam;
	String headOfTheFam;
	
	public void homeInfo(int noOfMembers){
		
		System.out.println("The number of members in the family "+noOfMembers);
		this.noOfMembers=noOfMembers;
		System.out.println("The number of members in the family "+this.noOfMembers);
	} 
	public void homeInfo(int noOfMembers,String nameOfFam){
		System.out.println("The number of members in the family "+noOfMembers +" And the name of family is "+nameOfFam);
	}
	public void homeInfo(int noOfMembers,String nameOfFam,String headOfTheFam){
		System.out.println("The number of members in the family "+noOfMembers +". The name of family is "+nameOfFam+ " & Head of the family is "+headOfTheFam);
	}
}