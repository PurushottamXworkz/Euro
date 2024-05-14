class Car1{
	public String name;
	public String address;
	public long phoneNumber;

	public Car1(String name,String address,long phoneNumber){
		System.out.println("Name :"+name+" address : "+address+" phoneNumber : "+phoneNumber);
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		System.out.println("Name :"+this.name+" address : "+this.address+" phoneNumber : "+this.phoneNumber);
	}
}