class Child{
	int noOfChilds=2;
	String nameOfChild="Kriti";
	boolean isChildNoughty=true;
	public Child(){
		System.out.println("This is no arguement constructor");
	}
	public void name(String childName){
		System.out.println("The name of child is : "+this.nameOfChild);
		nameOfChild=childName;
		System.out.println("The name of child is replaced by : "+this.nameOfChild);
	}
	public void active(boolean chlidActive){
		System.out.println("The child is active ? : "+this.isChildNoughty);
		isChildNoughty=chlidActive;
		this.name("Gundu");
		System.out.println("The child is active ? : "+this.isChildNoughty);
	}
	
}