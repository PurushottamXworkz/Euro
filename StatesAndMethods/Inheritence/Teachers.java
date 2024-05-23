class Teachers extends Principal{
	String name;
	public void teacher(String name){
		super.name=this.name;
		System.out.println("Teacher name :"+super.name);
		this.name=name;
		System.out.println("Teacher name :"+this.name);
		super.name=this.name;
		System.out.println("Teacher name after super :"+super.name);
	}
}