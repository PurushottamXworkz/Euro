class BuildingRunner{
	public static void main(String args[]){
		int[] totalFloors=Building.noOfFloors();
		short [] size=Building.sizeOfBuilding();
		
		for(int i=0;i<totalFloors.length;i++){
			System.out.println("Number of floors in Buildings : "+totalFloors[i]);
		}
		
		
		for(short area:size){
			System.out.println("Area of buildings : "+area);
		}
	}
}