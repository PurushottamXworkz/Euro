class Occurance{
	public static void main(String args[]){
		int arrayName[]={2,1,5,3,7,7,7,7,7,7};
		for(int i=0;i<arrayName.length;i++){
			int count=0;
			for(int j=0;j<arrayName.length;j++){
				if(arrayName[i]==arrayName[j]){
					count+=1;
					//System.out.println(arrayName[i]);
					System.out.println("Occurance is :"+count);
				}
			}
			
		}	
	}
}
		