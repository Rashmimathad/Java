class Screen{
	int screenNo;
	Movie movie;
	
	Screen(){
		
	}
	
	Screen(int screenNo,Movie movie){
		this.screenNo=screenNo;
		this.movie=movie;
	}
	
	public void getScreenInfo(){
		System.out.println("Screen info fetched....");
		System.out.println("Screen Number is : "+screenNo);
		System.out.println();
		System.out.println("Movie Details : ");
		this.movie.getMovieDetails();
	}
}