class Coil{
	int numberOfCoils=410;
	String brandName="Aspire";
	boolean brandIsSame=true;
	public Coil(){
		System.out.println("This is no arguement constructor");
	}
	public void nameOfBrand(String brand){
		System.out.println("The brand name is : "+this.brandName);
		brandName=brand;
		System.out.println("The brand name is : "+this.brandName);
	}
	public void availability(boolean brandIsPresent){
		System.out.println("Is the is present ? : "+this.brandIsSame);
		brandIsSame=brandIsPresent;
		this.nameOfBrand("Boult");
		System.out.println("Is the is present ? : "+this.brandIsSame);
	}
}