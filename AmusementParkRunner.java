 class AmusementParkRunner{
	public static void main(String park[]){
		System.out.println("main started");
	
		AmusementPark parkOne=new AmusementPark();
		parkOne.parkId = 1;
		parkOne.name = "Green Valley Park";
		parkOne.location = "Mysore";
		parkOne.openingTime = "7:00";
		parkOne.closingTime = "6:00";
		parkOne.entryFee = 150.00;
		parkOne.getParkInfo();
	
		AmusementPark parkTwo=new AmusementPark();
		parkTwo.parkId=2;
		parkTwo.name="Wonderla";
		parkTwo.location="Banglore";
		parkTwo.openingTime="8:00";
		parkTwo.closingTime="7:30";
		parkTwo.entryFee=1000.00;
		parkTwo.getParkInfo();
		
		
		AmusementPark parkThree=new AmusementPark();
		parkThree.parkId = 3;
		parkThree.name = "Nature Nest";
		parkThree.location = "Chennai";
		parkThree.openingTime = "6:30";
		parkThree.closingTime = "7:00";
		parkThree.entryFee = 100.00;
		parkThree.getParkInfo();
		
		AmusementPark parkFour=new AmusementPark();
		parkFour.parkId = 4;
		parkFour.name = "Lakeside Garden";
		parkFour.location = "Hyderabad";
		parkFour.openingTime = "8:00";
		parkFour.closingTime = "7:30";
		parkFour.entryFee = 120.00;
		parkFour.getParkInfo();
		
		AmusementPark parkFive=new AmusementPark();
		parkFive.parkId = 5;
		parkFive.name = "Rose Garden";
		parkFive.location = "Ooty";
		parkFive.openingTime = "9:00";
		parkFive.closingTime = "6:00";
		parkFive.entryFee = 200.00;
		parkFive.getParkInfo();
			
		AmusementPark parkSix=new AmusementPark();
		parkSix.parkId = 6;
		parkSix.name = "Sunset Park";
		parkSix.location = "Mangalore";
		parkSix.openingTime = "6:00";
		parkSix.closingTime = "6:30";
		parkSix.entryFee = 180.00;
		parkSix.getParkInfo();
		
		AmusementPark parkSeven=new AmusementPark();
		parkSeven.parkId = 7;
		parkSeven.name = "Wild Woods";
		parkSeven.location = "Madikeri";
		parkSeven.openingTime = "7:30";
		parkSeven.closingTime = "6:30";
		parkSeven.entryFee = 220.00;
		parkSeven.getParkInfo();
		
		AmusementPark parkEight=new AmusementPark();
		parkEight.parkId = 8;
		parkEight.name = "City Eco Park";
		parkEight.location = "Bangalore";
		parkEight.openingTime = "8:00";
		parkEight.closingTime = "8:00";
		parkEight.entryFee = 250.00;
		parkEight.getParkInfo();
		
		AmusementPark parkNine=new AmusementPark();
		parkNine.parkId = 9;
		parkNine.name = "Hilltop Park";
		parkNine.location = "Shimla";
		parkNine.openingTime = "5:30";
		parkNine.closingTime = "6:00";
		parkNine.entryFee = 300.00;
		parkNine.getParkInfo();
		
		AmusementPark parkTen=new AmusementPark();
		parkTen.parkId = 10;
		parkTen.name = "Pebble Garden";
		parkTen.location = "Pune";
		parkTen.openingTime = "7:00";
		parkTen.closingTime = "7:00";
		parkTen.entryFee = 160.00;
		parkTen.getParkInfo();
		
		AmusementPark parkEleven=new AmusementPark();
		parkEleven.parkId = 11;
		parkEleven.name = "Nature's Hug";
		parkEleven.location = "Delhi";
		parkEleven.openingTime = "6:00";
		parkEleven.closingTime = "6:30";
		parkEleven.entryFee = 120.00;
		parkEleven.getParkInfo();
			
		AmusementPark parkTwelve=new AmusementPark();
		parkTwelve.parkId = 12;
		parkTwelve.name = "Riverfront Park";
		parkTwelve.location = "Ahmedabad";
		parkTwelve.openingTime = "6:00";
		parkTwelve.closingTime = "9:00";
		parkTwelve.entryFee = 90.00;
		parkTwelve.getParkInfo();	
		
		AmusementPark parkThirteen=new AmusementPark();
		parkThirteen.parkId = 13;
		parkThirteen.name = "Adventure Zone";
		parkThirteen.location = "Manali";
		parkThirteen.openingTime = "8:30";
		parkThirteen.closingTime = "5:30";
		parkThirteen.entryFee = 500.00;
		parkThirteen.getParkInfo();
		
		AmusementPark parkFourteen=new AmusementPark();
		parkFourteen.parkId = 14;
		parkFourteen.name = "Whispering Pines";
		parkFourteen.location = "Coorg";
		parkFourteen.openingTime = "7:00";
		parkFourteen.closingTime = "7:00";
		parkFourteen.entryFee = 350.00;
		parkFourteen.getParkInfo();
		
		AmusementPark parkFifteen=new AmusementPark();
		parkFifteen.parkId = 15;
		parkFifteen.name = "Floral World";
		parkFifteen.location = "Chandigarh";
		parkFifteen.openingTime = "9:00";
		parkFifteen.closingTime = "5:00";
		parkFifteen.entryFee = 80.00;
		parkFifteen.getParkInfo();
		
		AmusementPark parkSixteen=new AmusementPark();
		parkSixteen.parkId = 16;
		parkSixteen.name = "Botanical Paradise";
		parkSixteen.location = "Thiruvananthapuram";
		parkSixteen.openingTime = "7:00";
		parkSixteen.closingTime = "6:00";
		parkSixteen.entryFee = 60.00;
		parkSixteen.getParkInfo();
		
		AmusementPark parkSeventeen=new AmusementPark();
		parkSeventeen.parkId = 17;
		parkSeventeen.name = "Urban Forest";
		parkSeventeen.location = "Nagpur";
		parkSeventeen.openingTime = "6:30";
		parkSeventeen.closingTime = "7:30";
		parkSeventeen.entryFee = 110.00;
		parkSeventeen.getParkInfo();	
		
		AmusementPark parkEighteen=new AmusementPark();
		parkEighteen.parkId = 18;
		parkEighteen.name = "Waterfall Retreat";
		parkEighteen.location = "Shillong";
		parkEighteen.openingTime = "8:00";
		parkEighteen.closingTime = "6:00";
		parkEighteen.entryFee = 270.00;
		parkEighteen.getParkInfo();
		
		AmusementPark parkNineteen=new AmusementPark();
		parkNineteen.parkId = 19;
		parkNineteen.name = "Deer Park";
		parkNineteen.location = "Visakhapatnam";
		parkNineteen.openingTime = "9:00";
		parkNineteen.closingTime = "6:30";
		parkNineteen.entryFee = 95.00;
		parkNineteen.getParkInfo();
		
		AmusementPark parkTwenty=new AmusementPark();
		parkTwenty.parkId = 20;
		parkTwenty.name = "Eco Harmony Park";
		parkTwenty.location = "Bangalore";
		parkTwenty.openingTime = "6:30";
		parkTwenty.closingTime = "7:30";
		parkTwenty.entryFee = 190.00;
		parkTwenty.getParkInfo();
			System.out.println();
	System.out.println("main ended");
	}
}