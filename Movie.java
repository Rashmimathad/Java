class Movie{
	int movieId;
	String movieName;
	double ticketPrice;
	
	Movie(){
		
	}
	
	Movie(int movieId,String movieName,double ticketPrice){
		this.movieId=movieId;
		this.movieName=movieName;
		this.ticketPrice=ticketPrice;
	}
	
	public void getMovieDetails(){
		System.out.println("Movie Details fetched....");
		System.out.println("Id of the movie is : "+movieId);
		System.out.println("Movie name is : "+movieName);
		System.out.println("Price of the ticket is  : "+ticketPrice);
	}
}