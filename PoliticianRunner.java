class PoliticianRunner{
	public static void main(String politics[]){
		System.out.println("main started");
		System.out.println();
		Politician politicianOne = new Politician(1,"Narendra Modi");
		System.out.println("id of politician is : "+politicianOne.politicianId);
		System.out.println("name of the politician : "+politicianOne.politicianName);
		System.out.println();
		
		Politician politicianTwo= new Politician("17/02/1954",'M',"BRS");
		System.out.println("date of birth of the politician is : "+politicianTwo.dateOfBirth);
		System.out.println("gender of the politician is : "+politicianTwo.gender);
		System.out.println("politicalParty of the politician is : "+politicianTwo.politicalParty);
		System.out.println();
		
		Politician politicianThree = new Politician("Home Minister of India","2019");
		System.out.println("position of the politician is : "+politicianThree.position);
		System.out.println("term started year of a politician is : "+politicianThree.termStarted);
		System.out.println();
		
		Politician politicianFour = new Politician();
		politicianFour.getPoliticianInfo();
		System.out.println();
		
		Politician politicianFive= new Politician(5,"K. Chandrashekar Rao","17/02/1954",'M',"BRS","Former Chief Minister of Telangana","2014");
		politicianFive.getPoliticianInfo();
		System.out.println();
		System.out.println("main ended");
	}
}