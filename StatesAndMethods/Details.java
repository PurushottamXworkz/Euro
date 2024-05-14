class Details{
	public String model;
	public String brand;
	public Car1 detail;
	public void display(String model,String brand,Car1 detail){
		System.out.println("Model : "+model);
		System.out.println("Brand : "+brand);
		System.out.println("Name : "+detail.name);
		System.out.println("Address :"+detail.address);
		System.out.println("PhoneNumber :"+detail.phoneNumber);
	}
}