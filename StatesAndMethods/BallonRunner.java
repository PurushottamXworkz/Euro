class BallonRunner{
	public static void main(String args[]){
		int[] noOfBallon=Ballon.totalBallons();
		for(int i=0;i<noOfBallon.length;i++){
			System.out.println("number of ballons varies: " +noOfBallon[i]);
		}
		
		float [] cost=Ballon.ballonPrice();
		for(float values:cost){
			System.out.println("cost of ballons are : " +values);
		}
	}
}