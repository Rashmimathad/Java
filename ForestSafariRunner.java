class ForestSafariRunner{
	public static void main(String[] safari){
		System.out.println("main started");
		
			ForestSafari safariOne=new ForestSafari();
			safariOne.safariId=1;
			safariOne.safariName="Bandipura safari";
			safariOne.safariType="Zeep safari";
			safariOne.safariTimings="10:00 AM to 12:00 PM";
			safariOne.groupSizeLimit=6;
			safariOne.isGuideAvailable=true;
			safariOne.getSafariInfo();
			
			ForestSafari safariTwo=new ForestSafari();
			safariTwo.safariId = 2;
			safariTwo.safariName = "Nagarhole Safari";
			safariTwo.safariType = "Canter Safari";
			safariTwo.safariTimings = "6:00 AM to 8:00 AM";
			safariTwo.groupSizeLimit = 20;
			safariTwo.isGuideAvailable = true;
			safariTwo.getSafariInfo();
			
			ForestSafari safariThree=new ForestSafari();
			safariThree.safariId = 3;
			safariThree.safariName = "Ranthambore Safari";
			safariThree.safariType = "Jeep Safari";
			safariThree.safariTimings = "4:00 PM to 6:00 PM";
			safariThree.groupSizeLimit = 6;
			safariThree.isGuideAvailable = true;
			safariThree.getSafariInfo();
			
			ForestSafari safariFour=new ForestSafari();
			safariFour.safariId = 4;
			safariFour.safariName = "Jim Corbett Safari";
			safariFour.safariType = "Elephant Safari";
			safariFour.safariTimings = "7:00 AM to 9:00 AM";
			safariFour.groupSizeLimit = 4;
			safariFour.isGuideAvailable = true;
			safariFour.getSafariInfo();
			
			ForestSafari safariFive=new ForestSafari();
			safariFive.safariId = 5;
			safariFive.safariName = "Kanha Safari";
			safariFive.safariType = "Jeep Safari";
			safariFive.safariTimings = "3:00 PM to 5:00 PM";
			safariFive.groupSizeLimit = 6;
			safariFive.isGuideAvailable = true;
			safariFive.getSafariInfo();
				
			ForestSafari safariSix=new ForestSafari();
			safariSix.safariId = 6;
			safariSix.safariName = "Gir Safari";
			safariSix.safariType = "Bus Safari";
			safariSix.safariTimings = "9:00 AM to 11:00 AM";
			safariSix.groupSizeLimit = 15;
			safariSix.isGuideAvailable = true;
			safariSix.getSafariInfo();
			
			ForestSafari safariSeven=new ForestSafari();
			safariSeven.safariId = 7;
			safariSeven.safariName = "Kaziranga Safari";
			safariSeven.safariType = "Elephant Safari";
			safariSeven.safariTimings = "5:30 AM to 7:30 AM";
			safariSeven.groupSizeLimit = 4;
			safariSeven.isGuideAvailable = true;
			safariSeven.getSafariInfo();
			
			ForestSafari safariEight=new ForestSafari();
			safariEight.safariId = 8;
			safariEight.safariName = "Sundarbans Safari";
			safariEight.safariType = "Boat Safari";
			safariEight.safariTimings = "8:00 AM to 10:00 AM";
			safariEight.groupSizeLimit = 10;
			safariEight.isGuideAvailable = false;
			safariEight.getSafariInfo();
			
			
			ForestSafari safariNine=new ForestSafari();
			safariNine.safariId = 9;
			safariNine.safariName = "Mudumalai Safari";
			safariNine.safariType = "Van Safari";
			safariNine.safariTimings = "4:30 PM to 6:30 PM";
			safariNine.groupSizeLimit = 12;
			safariNine.isGuideAvailable = true;
			safariNine.getSafariInfo();
			
			ForestSafari safariTen=new ForestSafari();
			safariTen.safariId = 10;
			safariTen.safariName = "Tadoba Safari";
			safariTen.safariType = "Gypsy Safari";
			safariTen.safariTimings = "6:00 AM to 8:00 AM";
			safariTen.groupSizeLimit = 6;
			safariTen.isGuideAvailable = true;
			safariTen.getSafariInfo();
			
			ForestSafari safariEleven=new ForestSafari();
			safariEleven.safariId = 11;
			safariEleven.safariName = "Periyar Safari";
			safariEleven.safariType = "Boat Safari";
			safariEleven.safariTimings = "3:00 PM to 5:00 PM";
			safariEleven.groupSizeLimit = 10;
			safariEleven.isGuideAvailable = false;
			safariEleven.getSafariInfo();
			
			
			ForestSafari safariTwelve=new ForestSafari();
			safariTwelve.safariId = 12;
			safariTwelve.safariName = "Manas Safari";
			safariTwelve.safariType = "Elephant Safari";
			safariTwelve.safariTimings = "7:00 AM to 9:00 AM";
			safariTwelve.groupSizeLimit = 4;
			safariTwelve.isGuideAvailable = true;
			safariTwelve.getSafariInfo();
			
			ForestSafari safariThirteen=new ForestSafari();
			safariThirteen.safariId = 13;
			safariThirteen.safariName = "Satpura Safari";
			safariThirteen.safariType = "Walking Safari";
			safariThirteen.safariTimings = "6:00 AM to 8:00 AM";
			safariThirteen.groupSizeLimit = 5;
			safariThirteen.isGuideAvailable = true;
			safariThirteen.getSafariInfo();
			
			ForestSafari safariFourteen=new ForestSafari();
			safariFourteen.safariId = 14;
			safariFourteen.safariName = "Pench Safari";
			safariFourteen.safariType = "Jeep Safari";
			safariFourteen.safariTimings = "4:00 PM to 6:00 PM";
			safariFourteen.groupSizeLimit = 6;
			safariFourteen.isGuideAvailable = true;
			safariFourteen.getSafariInfo();
			
			ForestSafari safariFifteen=new ForestSafari();
			safariFifteen.safariId = 15;
			safariFifteen.safariName = "Dudhwa Safari";
			safariFifteen.safariType = "Van Safari";
			safariFifteen.safariTimings = "8:00 AM to 10:00 AM";
			safariFifteen.groupSizeLimit = 12;
			safariFifteen.isGuideAvailable = true;
			safariFifteen.getSafariInfo();
			
			ForestSafari safariSeventeen=new ForestSafari();
			safariSeventeen.safariId = 17;
			safariSeventeen.safariName = "Simlipal Safari";
			safariSeventeen.safariType = "Bus Safari";
			safariSeventeen.safariTimings = "9:00 AM to 11:00 AM";
			safariSeventeen.groupSizeLimit = 15;
			safariSeventeen.isGuideAvailable = false;
			safariSeventeen.getSafariInfo();
			
			ForestSafari safariEighteen=new ForestSafari();
			safariEighteen.safariId = 18;
			safariEighteen.safariName = "Rajaji Safari";
			safariEighteen.safariType = "Canter Safari";
			safariEighteen.safariTimings = "3:00 PM to 5:00 PM";
			safariEighteen.groupSizeLimit = 20;
			safariEighteen.isGuideAvailable = true;
			safariEighteen.getSafariInfo();
			
			ForestSafari safariNineteen=new ForestSafari();
			safariNineteen.safariId = 19;
			safariNineteen.safariName = "Hemis Safari";
			safariNineteen.safariType = "Hiking Safari";
			safariNineteen.safariTimings = "7:00 AM to 9:00 AM";
			safariNineteen.groupSizeLimit = 5;
			safariNineteen.isGuideAvailable = true;
			safariNineteen.getSafariInfo();
			
			ForestSafari safariTwenty=new ForestSafari();
			safariTwenty.safariId = 20;
			safariTwenty.safariName = "Bhitarkanika Safari";
			safariTwenty.safariType = "Boat Safari";
			safariTwenty.safariTimings = "10:00 AM to 12:00 PM";
			safariTwenty.groupSizeLimit = 10;
			safariTwenty.isGuideAvailable = false;
			safariTwenty.getSafariInfo();
			
		System.out.println("main ended");
	}

}