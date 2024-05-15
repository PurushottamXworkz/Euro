class Phone{
	public String nameOfPhone;
	public String address;
	public long contact;
	
	public Phone(String nameOfPhone,String address,long contact){
		System.out.println("---------------------------------------");
		System.out.println("Name of Phone :"+nameOfPhone+" Address : "+address+" Contact : "+contact);
		this.nameOfPhone=nameOfPhone;
		this.address=address;
		this.contact=contact;
		System.out.println("---------------------------------------");
		//System.out.println("Name of Phone :"+this.nameOfPhone+" Address : "+this.address+" Contact : "+this.contact);
	}
}