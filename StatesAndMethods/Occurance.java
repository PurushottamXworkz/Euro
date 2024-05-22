class Occurance{
	public static void main(String args[]){
		int count=0;
		int arrayName[]={12,12,23,4,5,6,2,1,43,29,2};
		int start=0;
		int end=arrayName.length-1;
		while(start<=end){
			if(arrayName[start]==arrayName[end]){
				count++;
				System.out.println("Occurance number is :"+count);
			}
			start++;
			end--;
		}
	}
}
		