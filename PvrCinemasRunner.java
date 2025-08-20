class PvrCinemasRunner{
	public static void main(String pvr[]){
		System.out.println("main started");
		System.out.println();
		
		Movie movie=new Movie(1,"Su from So",150.00);
		Screen screen=new Screen(02,movie);
		PvrCinemas cinema=new PvrCinemas(111,"Asian Mall","Ram Prasad",50,screen);
		cinema.getPvrCinemasInfo();
		System.out.println();
		System.out.println("main ended");
	}

}