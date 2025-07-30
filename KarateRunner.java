class KarateRunner{
	public static void main(String karate[]){
		System.out.println("main started");
		System.out.println();
			Karate karateOne = new Karate(1,"Shotokon");
			System.out.println("ID of the karate is: " +karateOne.karateId);
			System.out.println("Name of the karate style: " + karateOne.name);
			System.out.println();
			
			Karate karateTwo = new Karate("Okinawa, Japan",false,"Green");
			System.out.println("Location of the dojo: " + karateTwo.location);
			System.out.println("Includes meditation: " + karateTwo.includesMeditation);
			System.out.println("Belt level: " + karateTwo.beltLevel);
			System.out.println();
			
			Karate karateThree = new Karate("Shito-Ryu","Green","Tue-Thu 7PM-9PM");
			System.out.println("Name of the karate style: " + karateThree.name);
			System.out.println("Location of the dojo: " + karateThree.location);
			System.out.println("Training schedule: " + karateThree.trainingSchedule);
			System.out.println();
			
			Karate karateFour = new Karate();
			karateFour.getKarateInfo();
			System.out.println();
			
			Karate karateFive = new Karate(5,"Kyokushin","Tokyo, Japan",true,"Purple","Wed-Fri 7AM-9AM");
			karateFive.getKarateInfo();
		System.out.println();
		System.out.println("main ended");
	}
}