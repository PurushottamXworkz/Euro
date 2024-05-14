class CarRunner{
	
	public static void main(String []args){
		Engines engine=new Engines(1400,"Petrol");
		Car car=new Car();
		car.carDetails("Tata",engine);
	}
}