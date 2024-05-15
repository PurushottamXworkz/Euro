class Guru{
	public String nameOfGuru;
	public String address;
	public long contact;
	
	public Guru(String nameOfGuru,String address,long contact){
		System.out.println("-------------------------------------");
		System.out.println("Name of Guru : "+nameOfGuru+" Address : "+address+" Contact : "+contact);
		this.nameOfGuru=nameOfGuru;
		this.address=address;
		this.contact=contact;
		System.out.println("-------------------------------------");
		//System.out.println("Name of Guru : "+this.nameOfGuru+" Address : "+this.address+" Contact : "+this.contact);
	}
}