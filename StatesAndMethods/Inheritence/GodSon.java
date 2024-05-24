class GodSon extends God{
	String name;
	public void godSon(String name){
		super.name=this.name;
		System.out.println("god son name :"+super.name);
		this.name=name;
		System.out.println("the god son name :"+this.name);
		super.name=this.name;
		System.out.println("the god son name after super :"+super.name);
	}
}