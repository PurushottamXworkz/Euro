class NokiaRunner{
	public static void main(String args[]){
		Nokia nokia=new SpareParts();
		nokia.branch();
		nokia.employees();
		((SpareParts)nokia).noOfSpares();
		((SpareParts)nokia).cost();
	}
}