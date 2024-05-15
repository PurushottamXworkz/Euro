class TrinerRunner{
	public static void main(String args[]){
		Trinee trinee=new Trinee();
		Triner triner=new Triner("Rajesh","Chennai",8541527451l);
		trinee.traineeDetails("Hrishi","Chennai",triner);
		System.out.println("-------------------------------------");
		trinee.traineeDetails("Pranav","Pune",triner);
		System.out.println("-------------------------------------");
		trinee.traineeDetails("Vishwas","Benaglore",triner);
	}
}