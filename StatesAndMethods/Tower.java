class Tower{
	int heightOfTheTower=4512;
	String typeOfTower="Radio";
	boolean isTowerInWork=true;
	public Tower(){
		System.out.println("This is Tower constructor which does not have any arguements");
	}
	public void checkHeight(int height){
		System.out.println("The height of the tower before is : "+this.heightOfTheTower);
		heightOfTheTower=height;
		System.out.println("The height of the tower after is : "+this.heightOfTheTower);
	}
	public void checkWorking(boolean working){
		System.out.println("The tower is in work ? : "+this.isTowerInWork);
		isTowerInWork=working;
		System.out.println("The tower is in work ? : "+this.isTowerInWork);
	}
}