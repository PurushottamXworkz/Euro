class Rotti{
	static int noOfRotti;
	static String nameOfRotti;
	static boolean rottiAvailable;
	
	public static void setRottiNumber(int number){
		noOfRotti=number;
	}
	public static int getRottiNumber(){
		return noOfRotti;
	}
	
	public static void setNameOfRotti(String Name){
		nameOfRotti=Name;
	}
	public static String getNameOfRotti(){
		return nameOfRotti;
	}
	
	public static void setRottiAvai(boolean available){
		rottiAvailable=available;
	}
	public static boolean getRottiAvai(){
		return rottiAvailable;
	}
	
}