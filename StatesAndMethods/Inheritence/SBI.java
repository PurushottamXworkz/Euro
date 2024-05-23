class SBI extends RBI{
	String name;
	public void sbi(String name){
		super.name=this.name;
		System.out.println("child class name :"+super.name);
		this.name=name;
		System.out.println("child class name :"+this.name);
		super.name=this.name;
		System.out.println("child class name after super :"+super.name);
	}
}