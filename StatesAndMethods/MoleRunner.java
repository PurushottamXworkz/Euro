class MoleRunner{
	public static void main(String args[]){
		String[] commandoNames=Mole.comnmanderNameOfEachCamp();
		for(String nameOfCammdos:commandoNames){
			System.out.println("Commandos name are : "+nameOfCammdos);
		}
		
		int [] camps={3,18,21,76,21,43,19};
		int [] campsVaries=Mole.noOfCamps(camps);
		
		for(int totalCamps:campsVaries){
			System.out.println("Number of camps are : "+totalCamps);
		}
	}
}