class CourtCase{
	int caseId;
	String caseType;
	String caseTitle;
	String courtName;
	String filingDate;
	String plaintiffName;
	String defendantName;
	
	CourtCase(){
		System.out.println();
		System.out.println("court case constructor without parameter loaded");		
	}
	
	CourtCase(int caseId,String caseType,String caseTitle){
		System.out.println();
		System.out.println("court case constructor with(int,String,String) parameter loaded");	
		this.caseId=caseId;
		this.caseType=caseType;
		this.caseTitle=caseTitle;
	}
	
	CourtCase(String courtName,String filingDate){
		System.out.println();
		System.out.println("court case constructor with(String,String) parameter loaded");
		this.courtName=courtName;
		this.filingDate=filingDate;
	}
	
	CourtCase(String caseTitle,String plaintiffName,String defendantName){
		System.out.println();
		System.out.println("court case constructor with(String,String,String) parameter loaded");		
		this.caseTitle=caseTitle;
		this.plaintiffName=plaintiffName;
		this.defendantName=defendantName;
	}
	
	CourtCase(int caseId,String caseType,String caseTitle,String courtName,String filingDate,String plaintiffName,String defendantName){
		System.out.println();
		System.out.println("court case constructor with parameter loaded");		
		this.caseId=caseId;
		this.caseTitle=caseTitle;
		this.courtName=courtName;
		this.filingDate=filingDate;
		this.plaintiffName=plaintiffName;
		this.defendantName=defendantName;
	}
	
	public void getCaseInfo(){

		System.out.println("court case details :");
		System.out.println("id of the case is : "+caseId);
		System.out.println("type of the case is : "+caseType);
		System.out.println("title of the case is : "+caseTitle);
		System.out.println("name of the court is : "+courtName);
		System.out.println("filing date of the case is : "+filingDate);
		System.out.println("plaintiffName of the case is : "+plaintiffName);
		System.out.println("defendantName of the case is : "+defendantName);
	}
}