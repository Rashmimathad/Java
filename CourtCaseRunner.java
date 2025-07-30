class CourtCaseRunner{
	public static void main(String court[]){
		System.out.println("main started");
		System.out.println();
		
		CourtCase caseOne	= new CourtCase(1,"Criminal Case","State vs Arjun");
		System.out.println("The case id is : "+caseOne.caseId);
		System.out.println("type of the case is : "+caseOne.caseType);
		System.out.println("The title of the case is : "+caseOne.caseTitle);
		System.out.println();
		
		CourtCase caseTwo	= new CourtCase("Commercial Court","15/01/2022");
		System.out.println("name of the court is : "+caseTwo.courtName);
		System.out.println("filing date of the case is : "+caseTwo.filingDate);
		System.out.println();
		
		CourtCase caseThree	= new CourtCase("Shruthi vs BBMP","Shruthi H","BBMP");
		System.out.println("The title of the case is : "+caseThree.caseTitle);
		System.out.println("plaintiffName of the case is : "+caseThree.plaintiffName);
		System.out.println("defendantName of the case is : "+caseThree.defendantName);
		
		CourtCase caseFour	= new CourtCase();
		caseFour.getCaseInfo();
		
		CourtCase caseFive= new CourtCase(5,"Criminal Case","State vs Arjun","Sessions Court","10/11/2021","State Police","Arjun K");
		caseFive.getCaseInfo();	
		System.out.println();
		System.out.println("main ended");
	}

}