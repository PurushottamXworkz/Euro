class MirrorRunner{
	public static void main(String args[]){
		Mirror m=new Mirror();
		m.priceOfMirror=12347.414f;
		m.mrpOfMirror=8487.22245;
		m.typeOfMirror='P';
		m.contactNum=8762779985l;
		m.addMirrors(8874);
		m.updatePocket("Manoj");
		m.deletePockets(false);
		System.out.println("The amount is : "+m.priceOfMirror);
		System.out.println("The value of pocket is : "+m.mrpOfMirror);
		System.out.println("The type of pocket is : "+m.typeOfMirror);
		System.out.println("The contact number is : "+m.contactNum);
		
	}
}