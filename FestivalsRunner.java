class FestivalsRunner{
	public static void main(String[] festival){
	System.out.println("main started");
		
		Festivals festivalOne=new Festivals();
		festivalOne.festivalId = 1;
		festivalOne.name = "Deepawali";
		festivalOne.country = "India";
		festivalOne.religion = "Hindu";
		festivalOne.date = "20/10";
		festivalOne.hasPublicHoliday = true;	
		festivalOne.getFestivalInfo();
		
		Festivals festivalTwo=new Festivals();
		festivalTwo.festivalId = 2;
		festivalTwo.name = "Christmas";
		festivalTwo.country = "USA";
		festivalTwo.religion = "Christianity";
		festivalTwo.date = "25/12";
		festivalTwo.hasPublicHoliday = true;
		festivalTwo.getFestivalInfo();	
		
		Festivals festivalThree=new Festivals();
		festivalThree.festivalId = 3;
		festivalThree.name = "Eid al-Fitr";
		festivalThree.country = "UAE";
		festivalThree.religion = "Islam";
		festivalThree.date = "10/04";
		festivalThree.hasPublicHoliday = true;
		festivalThree.getFestivalInfo();		
			
		Festivals festivalFour=new Festivals();
		festivalFour.festivalId = 4;
		festivalFour.name = "Holi";
		festivalFour.country = "India";
		festivalFour.religion = "Hindu";
		festivalFour.date = "08/03";
		festivalFour.hasPublicHoliday = true;
		festivalFour.getFestivalInfo();	
		
		Festivals festivalFive=new Festivals();
		festivalFive.festivalId = 5;
		festivalFive.name = "Thanksgiving";
		festivalFive.country = "USA";
		festivalFive.religion = "Secular";
		festivalFive.date = "24/11";
		festivalFive.hasPublicHoliday = true;
		festivalFive.getFestivalInfo();
			
		Festivals festivalSix=new Festivals();
		festivalSix.festivalId = 6;
		festivalSix.name = "Hanukkah";
		festivalSix.country = "Israel";
		festivalSix.religion = "Judaism";
		festivalSix.date = "18/12";
		festivalSix.hasPublicHoliday = false;
		festivalSix.getFestivalInfo();		
		
		Festivals festivalSeven=new Festivals();
		festivalSeven.festivalId = 7;
		festivalSeven.name = "Ramadan";
		festivalSeven.country = "Saudi Arabia";
		festivalSeven.religion = "Islam";
		festivalSeven.date = "01/04";
		festivalSeven.hasPublicHoliday = false;
		festivalSeven.getFestivalInfo();
		
		Festivals festivalEight=new Festivals();
		festivalEight.festivalId = 8;
		festivalEight.name = "Vesak";
		festivalEight.country = "Sri Lanka";
		festivalEight.religion = "Buddhism";
		festivalEight.date = "05/05";
		festivalEight.hasPublicHoliday = true;
		festivalEight.getFestivalInfo();	
		
		Festivals festivalNine=new Festivals();
		festivalNine.festivalId = 9;
		festivalNine.name = "Baisakhi";
		festivalNine.country = "India";
		festivalNine.religion = "Sikhism";
		festivalNine.date = "14/04";
		festivalNine.hasPublicHoliday = true;
		festivalNine.getFestivalInfo();		
		
		Festivals festivalTen=new Festivals();
		festivalTen.festivalId = 10;
		festivalTen.name = "Easter";
		festivalTen.country = "Italy";
		festivalTen.religion = "Christianity";
		festivalTen.date = "31/03";
		festivalTen.hasPublicHoliday = true;
		festivalTen.getFestivalInfo();		
		
		Festivals festivalEleven=new Festivals();
		festivalEleven.festivalId = 11;
		festivalEleven.name = "Lunar New Year";
		festivalEleven.country = "China";
		festivalEleven.religion = "Chinese Folk";
		festivalEleven.date = "10/02";
		festivalEleven.hasPublicHoliday = true;
		festivalEleven.getFestivalInfo();		
		
		Festivals festivalTwelve=new Festivals();
		festivalTwelve.festivalId = 12;
		festivalTwelve.name = "Good Friday";
		festivalTwelve.country = "UK";
		festivalTwelve.religion = "Christianity";
		festivalTwelve.date = "18/04";
		festivalTwelve.hasPublicHoliday = true;
		festivalTwelve.getFestivalInfo();		
		
		Festivals festivalThirteen=new Festivals();
		festivalThirteen.festivalId = 13;
		festivalThirteen.name = "Onam";
		festivalThirteen.country = "India";
		festivalThirteen.religion = "Hindu";
		festivalThirteen.date = "29/08";
		festivalThirteen.hasPublicHoliday = true;
		festivalThirteen.getFestivalInfo();		
		
		Festivals festivalFourteen=new Festivals();
		festivalFourteen.festivalId = 14;
		festivalFourteen.name = "Raksha Bandhan";
		festivalFourteen.country = "India";
		festivalFourteen.religion = "Hindu";
		festivalFourteen.date = "19/08";
		festivalFourteen.hasPublicHoliday = false;
		festivalFourteen.getFestivalInfo();		
		
		Festivals festivalFifteen=new Festivals();
		festivalFifteen.festivalId = 15;
		festivalFifteen.name = "Gudi Padwa";
		festivalFifteen.country = "India";
		festivalFifteen.religion = "Hindu";
		festivalFifteen.date = "09/04";
		festivalFifteen.hasPublicHoliday = false;
		festivalFifteen.getFestivalInfo();	
		
		Festivals festivalSixteen=new Festivals();
		festivalSixteen.festivalId = 16;
		festivalSixteen.name = "Navratri";
		festivalSixteen.country = "India";
		festivalSixteen.religion = "Hindu";
		festivalSixteen.date = "05/10";
		festivalSixteen.hasPublicHoliday = false;
		festivalSixteen.getFestivalInfo();	
		
		Festivals festivalSeventeen=new Festivals();
		festivalSeventeen.festivalId = 17;
		festivalSeventeen.name = "Boxing Day";
		festivalSeventeen.country = "UK";
		festivalSeventeen.religion = "Secular";
		festivalSeventeen.date = "26/12";
		festivalSeventeen.hasPublicHoliday = true;
		festivalSeventeen.getFestivalInfo();		
		
		Festivals festivalEighteen=new Festivals();
		festivalEighteen.festivalId = 18;
		festivalEighteen.name = "Yom Kippur";
		festivalEighteen.country = "Israel";
		festivalEighteen.religion = "Judaism";
		festivalEighteen.date = "03/10";
		festivalEighteen.hasPublicHoliday = true;
		festivalEighteen.getFestivalInfo();		
		
		Festivals festivalNineteen=new Festivals();
		festivalNineteen.festivalId = 19;
		festivalNineteen.name = "Pongal";
		festivalNineteen.country = "India";
		festivalNineteen.religion = "Hindu";
		festivalNineteen.date = "15/01";
		festivalNineteen.hasPublicHoliday = true;
		festivalNineteen.getFestivalInfo();
		
		Festivals festivalTwenty=new Festivals();
		festivalTwenty.festivalId = 20;
		festivalTwenty.name = "Obon";
		festivalTwenty.country = "Japan";
		festivalTwenty.religion = "Buddhism";
		festivalTwenty.date = "15/08";
		festivalTwenty.hasPublicHoliday = false;
		festivalTwenty.getFestivalInfo();
	
	System.out.println("\nmain ended");
	}
}