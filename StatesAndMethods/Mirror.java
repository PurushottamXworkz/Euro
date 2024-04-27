class Mirror{
	int noOfMirrors;
	float priceOfMirror;
	double mrpOfMirror;
	char typeOfMirror;
	String nameOfMirror;
	long contactNum;
	boolean isMirrorPresent;
	
	public void addMirrors(int noOfMiror){
		noOfMirrors=noOfMiror;
		System.out.println("The Number of pockets are : "+noOfMirrors);
	}
	public void updatePocket(String nameOfMiror){
		nameOfMirror=nameOfMiror;
		System.out.println("The name of pocket is : "+nameOfMirror);
	}
	public void deletePockets(boolean isMirorPresent){
		isMirrorPresent=isMirorPresent;
		System.out.println("The pocket is present : "+isMirrorPresent);
	}
}