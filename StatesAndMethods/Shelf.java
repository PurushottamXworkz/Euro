class Shelf{
	public static void intialiseArrayLengeth(int sizeOfArrray){
		int arrayName[]=new int[sizeOfArrray];
		//System.out.println("Array Length:"+arrayName.length);
		arrayName[0]=7;
	    arrayName[1]=4;
        arrayName[2]=11;
        arrayName[3]=6;
		//System.out.println("Element is:"+arrayName[0]);
		for(int i=0;i<arrayName.length;i++){
			for(int j=0;j<arrayName.length;j++){
				if(arrayName[i]!=0&&arrayName[i]<arrayName[j]){
				    int temp=arrayName[j];
					arrayName[j]=arrayName[i];
					arrayName[i]=temp;
			    }
			}
		}
			for(int i=0;i<arrayName.length;i++){
				if(arrayName[i]!=0){
			System.out.println("Array Element:"+arrayName[i]);
				}
		}
		
	}
}