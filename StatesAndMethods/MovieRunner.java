class MovieRunner{
	public static void main(String args[]){
		Movie movie=new Movie();
		Movie movie1=new Movie(32);
		Movie movie2=new Movie(32,510.99f);
		Movie movie3=new Movie(32,510.99f,789452.41245);
		Movie movie4=new Movie(32,510.99f,789452.41245,'U');
		Movie movie5=new Movie(32,510.99f,789452.41245,'U',true);
		Movie movie6=new Movie(32,510.99f,789452.41245,'U',true,8762772285l); 
		Movie movie7=new Movie(32,510.99f,789452.41245,'U',true,8762772285l,"Huccha");
		Movie movie8=new Movie(32,510.99f,789452.41245,'U',true,8762772285l,"Huccha","Sudeep");
		Movie movie9=new Movie(32,510.99f,789452.41245,'U',true,8762772285l,"Huccha","Sudeep",true);
	}
}