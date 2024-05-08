class Turbine{
	int numberOfBlades=78;
	public Turbine(){
		System.out.println("This is no arguement constructor");
	}
	public Turbine(int numberOfBlades){
		System.out.println("The number of blades : "+numberOfBlades);
		this.numberOfBlades=numberOfBlades;
		System.out.println("The number of blades are : "+this.numberOfBlades);
	}
}