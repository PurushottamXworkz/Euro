class FatherRunner{
	public static void main(String args[]){
		Father father=new Son();
		father.parent();
		father.brother();
		((Son)father).sonInLaw();
		((Son)father).brotherInLaw();
	}
}