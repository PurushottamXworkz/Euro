class Sniper{
	static int noOfGuns;
	static String regimentName;
	static boolean supplyIsavailable;
	
	public static void setGunsNumber(int noOfSnipers){
		noOfGuns=noOfSnipers;
	} 
	public static int getGunsNumber(){
		return noOfGuns;
	}
	
	public static void setReginame(String nameOfReg){
		regimentName=nameOfReg;
	}	
	public static String getReginame(){
		return regimentName;  
	}
	
	public static void setGunsupply(boolean zyx){
		supplyIsavailable=zyx;
	}
	public static boolean getGunsupply(){
		return supplyIsavailable;
	} 
}