class WalletRunner{
	public static void main(String args[]){
		Wallet.setNumberOfWallets(5000);
		System.out.println("The number of walletes are : "+Wallet.getNumberofwallets());
		Wallet.setNameOfWallet("PhonePay");
		System.out.println("The name of Wallet is  : "+Wallet.getNameOfwallet());
		Wallet.setAmountInWallet(true);
		System.out.println("The amount is present in walllet is true or false : "+Wallet.getAmountInWalllet());
	}
}