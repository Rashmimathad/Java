class AmusementPark{
	int parkId;
	String name;
	String location;
	String gamesNames[];
	String openingTime;
	String closingTime;
	double entryFee;
	
	AmusementPark(){
		System.out.println();
		System.out.println("AmusementPark constructor without parameteres invoked");
	}
	
	AmusementPark(int parkId,String name,double entryFee){
		System.out.println("AmusementPark constructor with (int,String,double) parameteres invoked");
		this.parkId=parkId;
		this.name=name;
		this.entryFee=entryFee;
	}
	
	AmusementPark(String gamesNames[]){
		System.out.println("AmusementPark constructor with (String []) parameter invoked");
		this.gamesNames=gamesNames;
	}
	
	AmusementPark(String gamesNames[],double entryFee){
		System.out.println("AmusementPark constructor with (String [],double) parameters invoked");
		this.gamesNames=gamesNames;
		this.entryFee=entryFee;
	}
	
	AmusementPark(String location,String openingTime,String closingTime){
		System.out.println("AmusementPark constructor with (String,String,String) parameteres invoked");
		this.location=location;
		this.openingTime=openingTime;
		this.closingTime=closingTime;
	}
	
	AmusementPark(int parkId,String name,String location,String openingTime,String closingTime,double entryFee,String gamesNames[]){
		System.out.println();
		System.out.println("AmusementPark constructor with all parameteres invoked");
		this.parkId=parkId;
		this.name=name;
		this.location=location;
		this.openingTime=openingTime;
		this.closingTime=closingTime;
		this.entryFee=entryFee;
		this.gamesNames=gamesNames;
	}
	
	public void getParkInfo(){
		System.out.println("Park details: ");
		System.out.println("id of park is:"+parkId);
		System.out.println("name of the park is:"+name);
		System.out.println("Park is located at :"+location);
		System.out.println("opening time of the park is :"+openingTime);
		System.out.println("closing Time of the park is:"+closingTime);
		System.out.println("entry fee of the park is:"+entryFee);
		System.out.println("The list of games names are : ");
			 for(String gamesName:gamesNames)
				 System.out.println(gamesName);
	}
}