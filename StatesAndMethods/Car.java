class Car{
	public String companyName;
	public Engines engine;
	
	public void carDetails(String companyName,Engines engine){
		System.out.println("company name of the car is===="+companyName);
		System.out.println("engine cc of the car is==="+engine.cc);
		System.out.println("varient of the car is===="+engine.varient);
		System.out.println("====================");
		
		this.companyName=companyName;
		this.engine=engine;
		
		System.out.println("company name of the car is===="+this.companyName);
		System.out.println("engine cc of the car is==="+this.engine.cc);
		System.out.println("varient of the car is===="+this.engine.varient);	
	}	
}