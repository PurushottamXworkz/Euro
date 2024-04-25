class RottiRunner{
	public static void main(String args[]){
		Rotti.setRottiNumber(100);
		System.out.println("The number of rotti's are : "+Rotti.getRottiNumber());
		Rotti.setNameOfRotti("Jolada Rotti");
		System.out.println("The name of rotti is : "+Rotti.getNameOfRotti());
		Rotti.setRottiAvai(false);
		System.out.println("The rotti is available : "+Rotti.getRottiAvai());
	}
}