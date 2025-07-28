class KarateRunner{
	public static void main(String ref[]){
		System.out.println("main started");
			
			Karate karateOne = new Karate(1,"Shotokon","Tokyo,Japan",true,"Yellow","Mon-Wed-Fri 6AM-8AM");
			/*karateOne.karateId = 1;
			karateOne.name = "Shotokan";
			karateOne.location = "Tokyo, Japan";
			karateOne.includesMeditation = true;
			karateOne.beltLevel = "Yellow";
			karateOne.trainingSchedule = "Mon-Wed-Fri 6AM-8AM";*/
			karateOne.getKarateInfo();

			Karate karateTwo = new Karate(2,"Goju-Ryu","Okinawa, Japan",false,"Green","Tue-Thu 7PM-9PM");
			/*karateTwo.karateId = 2;
			karateTwo.name = "Goju-Ryu";
			karateTwo.location = "Okinawa, Japan";
			karateTwo.includesMeditation = false;
			karateTwo.beltLevel = "Green";
			karateTwo.trainingSchedule = "Tue-Thu 7PM-9PM";*/
			karateTwo.getKarateInfo();

			Karate karateThree = new Karate(3,"Shito-Ryu","Kyoto, Japan",true,"Orange","Sat-Sun 8AM-10AM");
			/*karateThree.karateId = 3;
			karateThree.name = "Shito-Ryu";
			karateThree.location = "Kyoto, Japan";
			karateThree.includesMeditation = true;
			karateThree.beltLevel = "Orange";
			karateThree.trainingSchedule = "Sat-Sun 8AM-10AM";*/
			karateThree.getKarateInfo();

			Karate karateFour = new Karate(4,"Wado-Ryu","Osaka, Japan",false,"Blue","Mon-Fri 6PM-8PM");
			/*karateFour.karateId = 4;
			karateFour.name = "Wado-Ryu";
			karateFour.location = "Osaka, Japan";
			karateFour.includesMeditation = false;
			karateFour.beltLevel = "Blue";
			karateFour.trainingSchedule = "Mon-Fri 6PM-8PM";*/
			karateFour.getKarateInfo();

			Karate karateFive = new Karate(5,"Kyokushin","Tokyo, Japan",true,"Purple","Wed-Fri 7AM-9AM");
			/*karateFive.karateId = 5;
			karateFive.name = "Kyokushin";
			karateFive.location = "Tokyo, Japan";
			karateFive.includesMeditation = true;
			karateFive.beltLevel = "Purple";
			karateFive.trainingSchedule = "Wed-Fri 7AM-9AM";*/
			karateFive.getKarateInfo();

			Karate karateSix = new Karate(6,"Shorin-Ryu","Naha, Okinawa",true,"Brown","Tue-Thu 6AM-7AM");
			/*karateSix.karateId = 6;
			karateSix.name = "Shorin-Ryu";
			karateSix.location = "Naha, Okinawa";
			karateSix.includesMeditation = true;
			karateSix.beltLevel = "Brown";
			karateSix.trainingSchedule = "Tue-Thu 6AM-7AM";*/
			karateSix.getKarateInfo();

			Karate karateSeven = new Karate(7,"Uechi-Ryu","Fukuoka, Japan",false,"Red","Mon-Wed 5PM-7PM");
			/*karateSeven.karateId = 7;
			karateSeven.name = "Uechi-Ryu";
			karateSeven.location = "Fukuoka, Japan";
			karateSeven.includesMeditation = false;
			karateSeven.beltLevel = "Red";
			karateSeven.trainingSchedule = "Mon-Wed 5PM-7PM";*/
			karateSeven.getKarateInfo();

			Karate karateEight = new Karate(8,"Chito-Ryu","Sapporo, Japan",true,"White", "Fri-Sat 7PM-9PM");
			/*karateEight.karateId = 8;
			karateEight.name = "Chito-Ryu";
			karateEight.location = "Sapporo, Japan";
			karateEight.includesMeditation = true;
			karateEight.beltLevel = "White";
			karateEight.trainingSchedule = "Fri-Sat 7PM-9PM";*/
			karateEight.getKarateInfo();

			Karate karateNine = new Karate(9,"Shudokan","Kobe, Japan",false,"Black","Sun 8AM-11AM");
			/*karateNine.karateId = 9;
			karateNine.name = "Shudokan";
			karateNine.location = "Kobe, Japan";
			karateNine.includesMeditation = false;
			karateNine.beltLevel = "Black";
			karateNine.trainingSchedule = "Sun 8AM-11AM";*/
			karateNine.getKarateInfo();

			Karate karateTen = new Karate(10,"Ashihara","Nagoya, Japan",true,"Brown","Tue-Thu 8AM-10AM");
			/*karateTen.karateId = 10;
			karateTen.name = "Ashihara";
			karateTen.location = "Nagoya, Japan";
			karateTen.includesMeditation = true;
			karateTen.beltLevel = "Brown";
			karateTen.trainingSchedule = "Tue-Thu 8AM-10AM";*/
			karateTen.getKarateInfo();
					
			Karate karateEleven = new Karate(11,"Enshin","Osaka, Japan",false,"Orange","Mon-Wed-Fri 9AM-11AM");
			/*karateEleven.karateId=11;
			karateEleven.name = "Enshin";
			karateEleven.location = "Osaka, Japan";
			karateEleven.includesMeditation = false;
			karateEleven.beltLevel = "Orange";
			karateEleven.trainingSchedule = "Mon-Wed-Fri 9AM-11AM";*/
			karateEleven.getKarateInfo();

			Karate karateTwelve = new Karate(12,"Budokan","Hiroshima, Japan",true,"Green","Tue-Thu 4PM-6PM");
			/*karateTwelve.karateId = 12;
			karateTwelve.name = "Budokan";
			karateTwelve.location = "Hiroshima, Japan";
			karateTwelve.includesMeditation = true;
			karateTwelve.beltLevel = "Green";
			karateTwelve.trainingSchedule = "Tue-Thu 4PM-6PM";*/
			karateTwelve.getKarateInfo();

			Karate karateThirteen = new Karate(13,"Shindo Jinen-Ryu","Yokohama, Japan",false,"White","Mon-Tue 7PM-8PM");
			/*karateThirteen.karateId = 13;
			karateThirteen.name = "Shindo Jinen-Ryu";
			karateThirteen.location = "Yokohama, Japan";
			karateThirteen.includesMeditation = false;
			karateThirteen.beltLevel = "White";
			karateThirteen.trainingSchedule = "Mon-Tue 7PM-8PM";*/
			karateThirteen.getKarateInfo();

			Karate karateFourteen = new Karate(14,"Seido","Tokyo, Japan",true,"Blue","Fri-Sun 5AM-7AM");
			/*karateFourteen.karateId = 14;
			karateFourteen.name = "Seido";
			karateFourteen.location = "Tokyo, Japan";
			karateFourteen.includesMeditation = true;
			karateFourteen.beltLevel = "Blue";
			karateFourteen.trainingSchedule = "Fri-Sun 5AM-7AM";*/
			karateFourteen.getKarateInfo();

			Karate karateFifteen = new Karate(15,"Kudo","Sendai, Japan",false,"Purple","Wed-Fri 6PM-8PM");
			/*karateFifteen.karateId = 15;
			karateFifteen.name = "Kudo";
			karateFifteen.location = "Sendai, Japan";
			karateFifteen.includesMeditation = false;
			karateFifteen.beltLevel = "Purple";
			karateFifteen.trainingSchedule = "Wed-Fri 6PM-8PM";*/
			karateFifteen.getKarateInfo();

			Karate karateSixteen = new Karate(16,"Ryuei-Ryu","Nagasaki, Japan",true,"Red","Tue-Thu 9AM-11AM");
			/*karateSixteen.karateId = 16;
			karateSixteen.name = "Ryuei-Ryu";
			karateSixteen.location = "Nagasaki, Japan";
			karateSixteen.includesMeditation = true;
			karateSixteen.beltLevel = "Red";
			karateSixteen.trainingSchedule = "Tue-Thu 9AM-11AM";*/
			karateSixteen.getKarateInfo();

			Karate karateSeventeen = new Karate(17,"Byakuren Kaikan","Saitama, Japan",false,"Black","Sat 3PM-6PM");
			/*karateSeventeen.karateId = 17;
			karateSeventeen.name = "Byakuren Kaikan";
			karateSeventeen.location = "Saitama, Japan";
			karateSeventeen.includesMeditation = false;
			karateSeventeen.beltLevel = "Black";
			karateSeventeen.trainingSchedule = "Sat 3PM-6PM";*/
			karateSeventeen.getKarateInfo();

			Karate karateEighteen = new Karate(18,"Okinawa Kenpo","Naha, Okinawa",true,"Yellow","Mon-Wed 10AM-12PM");
			/*karateEighteen.karateId = 18;
			karateEighteen.name = "Okinawa Kenpo";
			karateEighteen.location = "Naha, Okinawa";
			karateEighteen.includesMeditation = true;
			karateEighteen.beltLevel = "Yellow";
			karateEighteen.trainingSchedule = "Mon-Wed 10AM-12PM";*/
			karateEighteen.getKarateInfo();

			Karate karateNineteen = new Karate(19,"Goshin-Ryu","Chiba, Japan",false,"Green","Fri-Sat 4PM-6PM");
			/*karateNineteen.karateId = 19;
			karateNineteen.name = "Goshin-Ryu";
			karateNineteen.location = "Chiba, Japan";
			karateNineteen.includesMeditation = false;
			karateNineteen.beltLevel = "Green";
			karateNineteen.trainingSchedule = "Fri-Sat 4PM-6PM";*/
			karateNineteen.getKarateInfo();
			
			Karate karateTwenty = new Karate(20,"Yamato Karate","Nara, Japan",true,"Black Belt - 3rd Dan","Monday to Friday, 6:00 PM - 8:00 PM");
			/*karateTwenty.karateId = 20;
			karateTwenty.name = "Yamato Karate";
			karateTwenty.location = "Nara, Japan";
			karateTwenty.includesMeditation = true;
			karateTwenty.beltLevel = "Black Belt - 3rd Dan";
			karateTwenty.trainingSchedule = "Monday to Friday, 6:00 PM - 8:00 PM";*/
			karateTwenty.getKarateInfo();

		System.out.println("main ended");
	}
}