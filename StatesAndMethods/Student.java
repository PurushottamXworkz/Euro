class Student{
	public String nameOfStudent;
	public String address;
	public Guru guru;
	
	public void studentDetails(String nameOfStudent,String address,Guru guru){
		System.out.println("Name Of student is :"+nameOfStudent);
		System.out.println("Address of Student :"+address);
		System.out.println("Name of Guru : "+guru.nameOfGuru);
		System.out.println("Adderss of Guru :"+guru.address);
		System.out.println("Contact of Guru :"+guru.contact);
	}
}