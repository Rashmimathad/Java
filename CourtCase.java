class CourtCase{
	int caseId;
	String caseType;
	String caseTitle;
	String courtName;
	String filingDate;
	String plaintiffName;
	String defendantName;
	
	public void getCaseInfo(){
		System.out.println();
		System.out.println(" court case details :");
		System.out.println("id of the case is : "+caseId);
		System.out.println("type of the case is : "+caseType);
		System.out.println("title of the case is : "+caseTitle);
		System.out.println("name of the court is : "+courtName);
		System.out.println("filing date of the case is : "+filingDate);
		System.out.println("plaintiffName of the case is : "+plaintiffName);
		System.out.println("defendantName of the case is : "+defendantName);
	}
}