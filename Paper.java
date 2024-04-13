class Paper{
	public static void main(String args[]){
		int paperSize=1024;
		byte paperValue=2;
		short paperRolls=15;
		float paperMRP=899.99f;
		double paperLength=12453.1234;
		long paperVolume=1241512412542l;
		boolean rightSize=true;
		char paperCode='M';
		String nameOfPaper="XLBond";
	 
		if(paperSize==1024){
			System.out.println("The given size of paper is correct");
		}
		if(paperValue==2){
			System.out.println("The given value of paper is correct");
		}
		if(paperRolls==15){
			System.out.println("The given rolls of paper is correct");
		}
		if(paperMRP==900){
			System.out.println("The given MRP of paper is correct");
		}
		if(paperLength==12453){
			System.out.println("The given length of paper is correct");
		}
		if(paperVolume==12415){
			System.out.println("The given volume of paper is correct");
		}
		if(rightSize==false){
			System.out.println("The given size of paper is false");
		}
		if(paperCode=='L'){
			System.out.println("The given code of paper is false");
		}
		if(nameOfPaper=="A4"){
			System.out.println("The given size of paper is false");
		}
	}
}