class Movie{
	public Movie(){
		System.out.println("This is no arguement constructor");
	}
	public Movie(int budget){
		System.out.println("The Movie budget is : "+budget);
	}
	public Movie(int budget,float ticketPrice){
		System.out.println("The budget of movie is : "+budget+" and the ticket price is : "+ticketPrice);
	}
	public Movie(int budget,float ticketPrice,double distribution){
		System.out.println("The budget of movie is : "+budget+".The ticket price is : "+ticketPrice+" and distribution amount is :"+distribution);
	}
	public Movie(int budget,float ticketPrice,double distribution,char typeOfMovie){
		System.out.println("The budget of movie is : "+budget+".The ticket price is : "+ticketPrice+".Distribution amount is :"+distribution+" & The type of movie is :"+typeOfMovie);
	}
	public Movie(int budget,float ticketPrice,double distribution,char typeOfMovie,boolean ticketsSold){
		System.out.println("The budget of movie is : "+budget+".The ticket price is : "+ticketPrice+".Distribution amount is :"+distribution+".The type of movie is :"+typeOfMovie+" and movie tickets are sold completely ?: "+ticketsSold);
	}
	public Movie(int budget,float ticketPrice,double distribution,char typeOfMovie,boolean ticketsSold,long contactForTickets){
		System.out.println("The budget of movie is : "+budget+".The ticket price is : "+ticketPrice+".Distribution amount is :"+distribution+".The type of movie is :"+typeOfMovie+".Movie tickets are sold completely ?: "+ticketsSold+" and contact for tickets : "+contactForTickets);
	}
	public Movie(int budget,float ticketPrice,double distribution,char typeOfMovie,boolean ticketsSold,long contactForTickets,String nameOfMovie){
		System.out.println("The budget of movie is : "+budget+".The ticket price is : "+ticketPrice+".Distribution amount is :"+distribution+".The type of movie is :"+typeOfMovie+".Movie tickets are sold completely ?: "+ticketsSold+".Contact for tickets : "+contactForTickets+" And Name of the movie is: "+nameOfMovie);
	}
	public Movie(int budget,float ticketPrice,double distribution,char typeOfMovie,boolean ticketsSold,long contactForTickets,String nameOfMovie,String castName){
		System.out.println("The budget of movie is : "+budget+".The ticket price is : "+ticketPrice+".Distribution amount is :"+distribution+".The type of movie is :"+typeOfMovie+".Movie tickets are sold completely ?: "+ticketsSold+".Contact for tickets : "+contactForTickets+".Name of the movie is: "+nameOfMovie+". And the lead role played by : "+castName);
	}
	public Movie(int budget,float ticketPrice,double distribution,char typeOfMovie,boolean ticketsSold,long contactForTickets,String nameOfMovie,String castName,boolean isMovieBlockbuster){
		System.out.println("The budget of movie is : "+budget+".The ticket price is : "+ticketPrice+".Distribution amount is :"+distribution+".The type of movie is :"+typeOfMovie+".Movie tickets are sold completely ?: "+ticketsSold+".Contact for tickets : "+contactForTickets+".Name of the movie is: "+nameOfMovie+". And the lead role played by : "+castName+" The movie is MovieBlockbuster : "+isMovieBlockbuster);
	}
}