class SniperRunner{
	public static void main(String args[]){
		Sniper.setGunsNumber(2500);
		System.out.println("The number of Snipers are : "+Sniper.getGunsNumber());
		Sniper.setReginame("Rajput");
		System.out.println("The name of regiment : "+Sniper.getReginame());
		Sniper.setGunsupply(true);
		System.out.println("The sniper guns are in supply : "+Sniper.getGunsupply());
	}
}