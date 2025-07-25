class Politician{

	int politicianId;
	String politicianName;
	String dateOfBirth;
	char gender;
	String politicalParty;
	String position;
	String termStarted;
	
	public void getPoliticianInfo(){
		System.out.println();
		System.out.println("Politician details : ");
		System.out.println("id of politician is : "+politicianId);
		System.out.println("name of the politician : "+politicianName);
		System.out.println("date of birth of the politician is : "+dateOfBirth);
		System.out.println("gender of the politician is : "+gender);
		System.out.println("politicalParty of the politician is : "+politicalParty);
		System.out.println("position of the politician is : "+position);
		System.out.println("term started year of a politician is : "+termStarted);
	}
	
}