class PocketRunner{
	public static void main(String args[]){
		Pocket p=new Pocket();
		p.amtInPocket=123.414f;
		p.totalValueOfPocket=78.22245;
		p.typeOfPocket='R';
		p.addPockets(123);
		p.contactNum=8762772285l;
		p.updatePocket("Manoj");
		p.deletePockets(false);
		System.out.println("The amount is : "+p.amtInPocket);
		System.out.println("The value of pocket is : "+p.totalValueOfPocket);
		System.out.println("The type of pocket is : "+p.typeOfPocket);
		System.out.println("The contact number is : "+p.contactNum);
		
	}
}