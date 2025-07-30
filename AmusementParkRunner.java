class AmusementParkRunner{

	public static void main(String park[]){
		System.out.println("main started");
		System.out.println();
		
		AmusementPark amusementParkOne = new AmusementPark(1,"Green Valley Park",150.00);
		System.out.println("The park id is "+amusementParkOne.parkId);
		System.out.println("The name of the park is "+amusementParkOne.name);
		System.out.println("The entry fee is "+amusementParkOne.entryFee);
		System.out.println();
		
		AmusementPark amusementParkTwo = new AmusementPark("Mysore","7:00 AM","6:00 PM");
		System.out.println("The park is located at "+amusementParkTwo.location);
		System.out.println("The opening time of the park is "+amusementParkTwo.openingTime);
		System.out.println("The closing time of the park is "+amusementParkTwo.closingTime);
		System.out.println();
		
		String gamesNames[]={"Haunted House","Roller Coaster","Ferris Wheel","Drop Tower","Bumper Cars","Pendulum Ride"};
		AmusementPark amusementParkThree = new AmusementPark(gamesNames);
		System.out.println("The list of games names are : ");
			 for(String gamesName:gamesNames)
				 System.out.println(gamesName);
		
		AmusementPark amusementParkFour=new AmusementPark(4,"Lakeside Garden", "Hyderabad","8:00 AM","7:30 PM", 120.00,gamesNames);
		amusementParkFour.getParkInfo();
		System.out.println();
		
		AmusementPark amusementParkFive=new AmusementPark(gamesNames,100.00);
		System.out.println("The list of games names are : ");
			 for(String gamesName:gamesNames)
				 System.out.println(gamesName);
		System.out.println("The entry fee is "+amusementParkFive.entryFee);
		System.out.println();
		
		System.out.println("main ended");
	}
}