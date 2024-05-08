class BikeRunner{
	public static void main(String args[]){
		Bike bike=new Bike();
		Bike bike1=new Bike(75000);
		Bike bike2=new Bike(75000,1500.4258f);
		Bike bike3=new Bike(75000,1500.2451f,true);
		Bike bike4=new Bike(75000,1500.2451f,true,8065014732l);
		Bike bike5=new Bike(75000,1500.2451f,true,8065014732l,'B');
		Bike bike6=new Bike(75000,1500.2451f,true,8065014732l,'B',"Honda");
		Bike bike7=new Bike(75000,1500.2451f,true,8065014732l,'B',"Honda",8546.124574d);
		Bike bike8=new Bike(75000,1500.2451f,true,8065014732l,'B',"Honda",8546.124574d);
		Bike bike9=new Bike(75000,1500.2451f,true,8065014732l,'B',"Honda",8546.124574d,"Banaras");
	}
}