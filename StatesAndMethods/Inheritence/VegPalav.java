class VegPalav extends Palav{
	public void breadPalav(){
		System.out.println("This is Veg Palav child class ");
	}
	public void incredients(){
		System.out.println("The number of incredients are :"+super.noOfIncredients);
	}
	public void masala(){
		System.out.println("The number of masala powder :"+super.noOfMasala);
	}
	public void peas(){
		System.out.println("The number of peas are :"+super.noOfPeas);
	}
}