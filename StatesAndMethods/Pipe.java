class Pipe{
	public Pipe(){
		//System.out.println("This is no argument constructor");
		this("PVC",800);
	}
	public Pipe(String brandName){
		System.out.println("The name of pipe brand is :"+brandName);
	}
	public Pipe(int priceOfPipe){
		System.out.println("price of pipe is :"+priceOfPipe);
	}
	public Pipe(String brandName,int priceOfPipe){
		System.out.println("The name of pipe brand is :"+brandName);
		System.out.println("price of pipe is :"+priceOfPipe);
	}
}