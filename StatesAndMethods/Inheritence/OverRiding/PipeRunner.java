class PipeRunner{
	public static void main(String []args){
		Pipe pipe=new Ashirwad();
		pipe.quality();
		pipe.cost();
		((Ashirwad)pipe).companyName();
		((Ashirwad)pipe).price();	
	}
}