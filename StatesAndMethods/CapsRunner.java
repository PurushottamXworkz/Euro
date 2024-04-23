class CapsRunner{
	public static void main(String args[]){
		
		int [] totalCap=Caps.totalCaps();
			for(int i=0;i<totalCap.length;i++){
				System.out.println("The number of caps : "+totalCap[i]);
			}
		Caps.capName();
			String [] brandName=Caps.capName();
			for(String values:brandName ){
			
			System.out.println("Brand name of cap: "+values);
		}
	}
}