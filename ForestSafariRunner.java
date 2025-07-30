class ForestSafariRunner{

	public static void main(String safari[]){
		System.out.println("main started");
		System.out.println();
		
		ForestSafari safariOne = new ForestSafari(1,"Bandipura safari","Zeep safari");
		System.out.println("id of the safari is :"+safariOne.safariId);
		System.out.println("name of the safari : "+safariOne.safariName);
		System.out.println("type of safari : "+safariOne.safariType);
		
		ForestSafari safariTwo = new ForestSafari("4:00 PM to 6:00 PM",6,true);
		System.out.println("timings of safari : "+safariTwo.safariTimings);
		System.out.println("group size limit of safari is : "+safariTwo.groupSizeLimit);
		System.out.println("is guide avaialable? "+safariTwo.isGuideAvailable);
		System.out.println();
		
		ForestSafari safariThree = new ForestSafari();
		safariThree.getSafariInfo();
		System.out.println();
		
		ForestSafari safariFour = new ForestSafari("Gir Safari","Bus Safari","9:00 AM to 11:00 AM");
		System.out.println("name of the safari : "+safariFour.safariName);
		System.out.println("type of safari : "+safariFour.safariType);
		System.out.println("timings of safari : "+safariFour.safariTimings);
		System.out.println();
		
		ForestSafari safariFive = new ForestSafari(5,"Kaziranga Safari","Elephant Safari","5:30 AM to 7:30 AM",4,true);
		safariFive.getSafariInfo();
		System.out.println();
		System.out.println("main ended");
	}
}