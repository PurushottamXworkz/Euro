class Door{
	public Door(){
		this(4500,"Steel");
	}
	public Door(int price){
		System.out.println("The price of door is : "+price);
	}
	public Door(int price,String nameOfMaterial){
		System.out.println("The price of door is : "+price);
		System.out.println("The material name is : "+nameOfMaterial);
	}
}