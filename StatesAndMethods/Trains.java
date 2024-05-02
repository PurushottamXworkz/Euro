class Trains{
	
	public int noOfCoach;
    public String nameOfTheTrain;
    public char typeOfTrain;
	
	public void setNoOfCoach(int noOfCoach){
		this.noOfCoach=noOfCoach;
	}
	
	public void setNameOfTheTrain(String nameOfTheTrain){
		this.nameOfTheTrain=nameOfTheTrain;
	}
	
	public void setTypeOfTrain(char typeOfTrain){
		this.typeOfTrain=typeOfTrain;
	}
	
	public int getNoOfCoach(){
		System.out.println("number of coach in train is==="+noOfCoach);
		return noOfCoach;
	}
	
	public String getNameOfTheTrain(){
		System.out.println("name of the train is==="+nameOfTheTrain);
		return nameOfTheTrain;
	}
	
	public char getTypeOfTrain(){
		System.out.println("type of the train is==="+typeOfTrain);
		return typeOfTrain;
	}
	
}
      