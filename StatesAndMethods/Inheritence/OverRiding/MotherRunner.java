class MotherRunner{
	public static void main(String args[]){
		Mother mom=new Daughter();
		mom.parent();
		mom.sister();
		((Daughter)mom).daughterInLaw();
		((Daughter)mom).motherInLaw();
	}
}