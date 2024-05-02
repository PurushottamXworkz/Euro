class Laptop{
	
	public int price;
	public int rom;
	public String companyName;
	
	public void setPrice(int price){
		this.price=price;
	}
	
	public void setRom(int rom){
		this.rom=rom;
	}
	
	public void setCompanyName(String companyName){
		this.companyName=companyName;
	}
	
	public int getPrice(){
		System.out.println("the cost of laptop is==="+price);
		return price;
	}
	
	public double getRom(){
		System.out.println("the storage of the laptop is==="+rom);
		return rom;
	}
	
	public String getCompanyName(){
		System.out.println("company name of the laptop is==="+companyName);
		return companyName;
	}
	
}