class Prince extends King{
	String name;
	public void prince(String name){
		super.name=this.name;
		System.out.println("princi name :"+super.name);
		this.name=name;
		System.out.println("prince name :"+this.name);
		super.name=this.name;
		System.out.println("prince name after super :"+super.name);
	}
}