class AmusementPark{
	int parkId;
	String name;
	String location;
	String openingTime;
	String closingTime;
	double entryFee;
	
	AmusementPark(){
		System.out.println();
		System.out.println("AmusementPark constructor without parameteres invoked");
	}
	
	AmusementPark(int parkId,String name,String location,String openingTime,String closingTime,double entryFee){
		System.out.println();
		System.out.println("AmusementPark constructor with  parameteres invoked");
		this.parkId=parkId;
		this.name=name;
		this.location=location;
		this.openingTime=openingTime;
		this.closingTime=closingTime;
	}
	
	public void getParkInfo(){
		System.out.println("Park details: ");
		System.out.println("id of park is:"+parkId);
		System.out.println("name of the park is:"+name);
		System.out.println("Park is located at :"+location);
		System.out.println("opening time of the park is :"+openingTime);
		System.out.println("closing Time of the park is:"+closingTime);
		System.out.println("entry fee of the park is:"+entryFee);
	}
}