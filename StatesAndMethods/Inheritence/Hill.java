class Hill extends Mountain{
	public void hillMethod(){
		System.out.println("This is Hill class");
		System.out.println("Name Of Mountain : "+super.nameOfMountain);
		System.out.println("Height Of maountain :"+super.heightOfmaountain);
		System.out.println("Entry Fees :"+super.entryFees);
		System.out.println("Location Of Mountain :"+super.locationOfMountain);
	}
}