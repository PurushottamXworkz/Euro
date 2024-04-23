class PampletRunner{
	public static void main(String args[]){
		int[] totalPamplets=Pamplet.noOfPamplets();
		String [] content=Pamplet.pampletDetails();
		for(int i=0;i<totalPamplets.length;i++){
			
			System.out.println("Number of pamplets : "+totalPamplets[i]);
		}
		
		
		for(String contentInPamplet:content){
			System.out.println("Content in pamplet : "+contentInPamplet);
		}
	}
}