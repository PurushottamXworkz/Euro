class Bike{
	public Bike(){
		System.out.println("This is no arguement constructor");
	}
	public Bike(int priceOfBike){
		System.out.println("The price of bike is : "+priceOfBike);
	}
	public Bike(int priceOfBike,float regFees){
		System.out.println("The price of bike is : "+priceOfBike+".And registration fees is "+regFees);
	}
	public Bike(int priceOfBike,float regFees,boolean bikeAvailable){
		System.out.println("The price of bike is : "+priceOfBike+".Registration fees is :"+regFees+" And Bike is available : "+bikeAvailable);
	}
	public Bike(int priceOfBike,float regFees,boolean bikeAvailable,long dealerContact){
		System.out.println("The price of bike is : "+priceOfBike+".Registration fees is :"+regFees+".Bike is available : "+bikeAvailable+"& Dealer contact :"+dealerContact);
	}
	public Bike(int priceOfBike,float regFees,boolean bikeAvailable,long dealerContact,char seriesBike){
		System.out.println("The price of bike is : "+priceOfBike+".Registration fees is :"+regFees+". Bike is available : "+bikeAvailable+". Dealer contact :"+dealerContact+" And bike series : "+seriesBike);
	}
	public Bike(int priceOfBike,float regFees,boolean bikeAvailable,long dealerContact,char seriesBike,String nameOfBike){
		System.out.println("The price of bike is : "+priceOfBike+".Registration fees is :"+regFees+". Bike is available : "+bikeAvailable+". Dealer contact :"+dealerContact+" bike series : "+seriesBike+" and the bike name is :"+nameOfBike);
	}
	public Bike(int priceOfBike,float regFees,boolean bikeAvailable,long dealerContact,char seriesBike,String nameOfBike,double rtoFees){
		System.out.println("The price of bike is : "+priceOfBike+".Registration fees is :"+regFees+". Bike is available : "+bikeAvailable+". Dealer contact :"+dealerContact+" bike series : "+seriesBike+" the bike name is :"+nameOfBike+" and the RTO fees "+rtoFees);
	}
	public Bike(int priceOfBike,float regFees,boolean bikeAvailable,long dealerContact,char seriesBike,String nameOfBike,double rtoFees,String address){
		System.out.println("The price of bike is : "+priceOfBike+".Registration fees is :"+regFees+". Bike is available : "+bikeAvailable+". Dealer contact :"+dealerContact+" bike series : "+seriesBike+" the bike name is :"+nameOfBike+" the RTO fees "+rtoFees+" and Address of the bike show room "+address);
	}
}