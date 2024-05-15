class Trinee{
	public String nameOfTrinee;
	public String address;
	public Triner trainer;
	
	public void traineeDetails(String nameOfTrinee,String address,Triner trainer){
		System.out.println("Name Of student is :"+nameOfTrinee);
		System.out.println("Address of Student :"+address);
		System.out.println("Name of Mentor : "+trainer.nameOfTriner);
		System.out.println("Adderss of Mentor :"+trainer.address);
		System.out.println("Contact of Mentor :"+trainer.contact);
	}
}