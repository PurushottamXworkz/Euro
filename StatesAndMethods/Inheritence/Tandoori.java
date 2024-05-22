class Tandoori extends Rotti{
	public void rottiType(){
		System.out.println("This name is tandoori rotti child class");
	}
	public void rotiName(){
		System.out.println("The name of roti is :"+super.nameOfRoti);
	}
	public void rotisInNumber(){
		System.out.println("The number of rottis are :"+super.noOfRotis);
	}
	public void amount(){
		System.out.println("The amount of roti is :"+super.amountOfRoti);
	}
}