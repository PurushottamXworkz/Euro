class Trunk{
	static int trunkSize=78;
	public static void trunkInfo(){
		System.out.println("trunkInfo method : "+trunkSize);
		Flute.infoOfFlute();
	}
	public static void typeOfTrunk(){
		String nameOfTrunk="New Trunk";
		trunkInfo();
		System.out.println("Name Of Trunk from typeOfTrunk method: "+nameOfTrunk);
	}
}