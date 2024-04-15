class Home{
	public static void main(String args[]){
		int[] noOfHomes={2,3,1,4,1,2,3,4,2,1,3,2,1,2,1,1};
		byte[] membersOfHome={5,3,5,4,5,2,3,3,4,5,2,1,4,2,3};
		short[] numberOfHome={3,2,3,4,5,6,22,12,10,54,66,54};
		long[] dataOfHome={1112,2323,4334,4135,56566,8764,2324,1435435,95478645};
		
		for(int i=0;i<noOfHomes.length;i++){
			System.out.println("Number Of Homes : "+noOfHomes[i]);
		}
		
		for(int i=0;i<membersOfHome.length;i++){
			System.out.println("Members Of Home "+membersOfHome[i]);
		}
		
		for(int i=0;i<numberOfHome.length;i++){
			System.out.println("Number Of Home: "+numberOfHome[i]);
		}
		
		for(int i=0;i<dataOfHome.length;i++){
			System.out.println("Data Of Home: "+dataOfHome[i]);
		}
	}
}