class Avalakki{
	public String nameOfAvalakki;
	public Oggarni oggarni;
	
	public void avalakkiDetails(String nameOfAvalakki,Oggarni oggarni){
		System.out.println("The name of Avalakki is :"+nameOfAvalakki);
		System.out.println("The incredients of avalakki is : "+oggarni.shenga);
		System.out.println("The incredients of avalakki is : "+oggarni.daani);
		
		System.out.println("--------------------------------------------------");
		
		this.nameOfAvalakki=nameOfAvalakki;
		this.oggarni=oggarni;
		
		System.out.println("The name of Avalakki is :"+this.nameOfAvalakki);
		System.out.println("The incredients of avalakki is : "+this.oggarni.shenga);
		System.out.println("The incredients of avalakki is : "+this.oggarni.daani);
	}
}