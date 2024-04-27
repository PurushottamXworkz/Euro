class Pocket{
	int noOfPockets;
	float amtInPocket;
	double totalValueOfPocket;
	char typeOfPocket;
	String nameOfPocket;
	long contactNum;
	boolean isPocketPresent;
	
	public void addPockets(int noOfPocke){
		noOfPockets=noOfPocke;
		System.out.println("The Number of pockets are : "+noOfPockets);
	}
	public void updatePocket(String nameOfPock){
		nameOfPocket=nameOfPock;
		System.out.println("The name of pocket is : "+nameOfPocket);
	}
	public void deletePockets(boolean isPocketPres){
		isPocketPresent=isPocketPres;
		System.out.println("The pocket is present : "+isPocketPresent);
	}
}