class Wallet{
	static int countsOfWallet;
	static String nameOfWallet;
	static boolean amountInWallet;
	
	public static void setNumberOfWallets(int Num){
		countsOfWallet=Num;
	}
	public static int getNumberofwallets(){
		return countsOfWallet;
	}
	
	public static void setNameOfWallet(String Name){
		nameOfWallet=Name;
	}
	public static String getNameOfwallet(){
		return nameOfWallet;
	}
	
	public static void setAmountInWallet(boolean amt){
		amountInWallet=amt;
	}  
	public static boolean getAmountInWalllet(){
		return amountInWallet;
	}
}