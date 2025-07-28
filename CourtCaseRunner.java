class CourtCaseRunner{
	public static void main(String[] cases){
		System.out.println("main started");
		
			CourtCase caseOne= new CourtCase(1,"Civil Case","State Vs BBMP","high Court","23/07/2025","Rashmi","BBMP");
			/*caseOne.caseId=1;
			caseOne.caseType="Civil Case";
			caseOne.caseTitle="State vs BBMP";
			caseOne.courtName="High Court";
			caseOne.filingDate="23/07/2025";
			caseOne.plaintiffName="Rashmi";
			caseOne.defendantName="BBMP";*/
			caseOne.getCaseInfo();
			
			CourtCase caseTwo= new CourtCase(2,"Criminal Case","State vs Rahul","Supreme Court","12/06/2024","Government of India","Rahul K");
			caseTwo.getCaseInfo();
			/*caseTwo.caseId = 2;
			caseTwo.caseType = "Criminal Case";
			caseTwo.caseTitle = "State vs Rahul";
			caseTwo.courtName = "Supreme Court";
			caseTwo.filingDate = "12/06/2024";
			caseTwo.plaintiffName = "Government of India";
			caseTwo.defendantName = "Rahul K";
			caseTwo.getCaseInfo();*/
			
			CourtCase caseThree= new CourtCase(3,"Family Case","Anjali vs Mohan","Family Court","01/03/2023","Anjali M","Mohan B");
			caseThree.getCaseInfo();
			/*caseThree.caseId = 3;
			caseThree.caseType = "Family Case";
			caseThree.caseTitle = "Anjali vs Mohan";
			caseThree.courtName = "Family Court";
			caseThree.filingDate = "01/03/2023";
			caseThree.plaintiffName = "Anjali M";
			caseThree.defendantName = "Mohan B";
			caseThree.getCaseInfo();*/
			
			CourtCase caseFour= new CourtCase(4,"Civil Case","Shruthi vs BBMP","City Civil Court","19/08/2022","Shruthi H","BBMP");
			caseFour.getCaseInfo();
			/*caseFour.caseId = 4;
			caseFour.caseType = "Civil Case";
			caseFour.caseTitle = "Shruthi vs BBMP";
			caseFour.courtName = "City Civil Court";
			caseFour.filingDate = "19/08/2022";
			caseFour.plaintiffName = "Shruthi H";
			caseFour.defendantName = "BBMP";
			caseFour.getCaseInfo();*/
			
			CourtCase caseFive= new CourtCase(5,"Criminal Case","State vs Arjun","Sessions Court","10/11/2021","State Police","Arjun K");
			caseFive.getCaseInfo();	
			/*caseFive.caseId = 5;
			caseFive.caseType = "Criminal Case";
			caseFive.caseTitle = "State vs Arjun";
			caseFive.courtName = "Sessions Court";
			caseFive.filingDate = "10/11/2021";
			caseFive.plaintiffName = "State Police";
			caseFive.defendantName = "Arjun K";
			caseFive.getCaseInfo();	*/
			
			CourtCase caseSix= new CourtCase(6,"Corporate Dispute","TCS vs Infosys","Commercial Court","15/01/2022","TCS Ltd.","Infosys Ltd.");
			caseSix.getCaseInfo();	
			/*caseSix.caseId = 6;
			caseSix.caseType = "Corporate Dispute";
			caseSix.caseTitle = "TCS vs Infosys";
			caseSix.courtName = "Commercial Court";
			caseSix.filingDate = "15/01/2022";
			caseSix.plaintiffName = "TCS Ltd.";
			caseSix.defendantName = "Infosys Ltd.";
			caseSix.getCaseInfo();	*/
			
			CourtCase caseSeven= new CourtCase(7,"Labour Case","Shiva vs ABC Pvt Ltd","Labour Court","08/04/2023","Shiva N","ABC Pvt Ltd");
			caseSeven.getCaseInfo();
			/*caseSeven.caseId = 7;
			caseSeven.caseType = "Labour Case";
			caseSeven.caseTitle = "Shiva vs ABC Pvt Ltd";
			caseSeven.courtName = "Labour Court";
			caseSeven.filingDate = "08/04/2023";
			caseSeven.plaintiffName = "Shiva N";
			caseSeven.defendantName = "ABC Pvt Ltd";
			caseSeven.getCaseInfo();*/
			
			CourtCase caseEight= new CourtCase(8,"Property Dispute","Ravi vs Ramesh","District Court","27/02/2024","Ravi P","Ramesh R");
			caseEight.getCaseInfo();
			/*caseEight.caseId = 8;
			caseEight.caseType = "Property Dispute";
			caseEight.caseTitle = "Ravi vs Ramesh";
			caseEight.courtName = "District Court";
			caseEight.filingDate = "27/02/2024";
			caseEight.plaintiffName = "Ravi P";
			caseEight.defendantName = "Ramesh R";
			caseEight.getCaseInfo();*/
			
			CourtCase caseNine= new CourtCase(9,"Divorce Case","Suma vs Manju","Family Court","30/09/2021","Suma M","Manju V");
			caseNine.getCaseInfo();
			/*caseNine.caseId = 9;
			caseNine.caseType = "Divorce Case";
			caseNine.caseTitle = "Suma vs Manju";
			caseNine.courtName = "Family Court";
			caseNine.filingDate = "30/09/2021";
			caseNine.plaintiffName = "Suma M";
			caseNine.defendantName = "Manju V";
			caseNine.getCaseInfo();	*/
			
			CourtCase caseTen= new CourtCase(10,"Cyber Crime","State vs Unknown Hacker","Cyber Crime Court","05/06/2024","Cyber Cell","Unknown");
			caseTen.getCaseInfo();
			/*caseTen.caseId = 10;
			caseTen.caseType = "Cyber Crime";
			caseTen.caseTitle = "State vs Unknown Hacker";
			caseTen.courtName = "Cyber Crime Court";
			caseTen.filingDate = "05/06/2024";
			caseTen.plaintiffName = "Cyber Cell";
			caseTen.defendantName = "Unknown";
			caseTen.getCaseInfo();	*/
			
			CourtCase caseEleven= new CourtCase(11,"Civil Case","Priya vs Water Board","High Court","11/01/2023","Priya D","Water Board");
			caseEleven.getCaseInfo();
			/*caseEleven.caseId = 11;
			caseEleven.caseType = "Civil Case";
			caseEleven.caseTitle = "Priya vs Water Board";
			caseEleven.courtName = "High Court";
			caseEleven.filingDate = "11/01/2023";
			caseEleven.plaintiffName = "Priya D";
			caseEleven.defendantName="Water Board";
			caseEleven.getCaseInfo();*/
			
			CourtCase caseTwelve= new CourtCase(12,"Criminal Case","State vs Sagar","Sessions Court","09/12/2022","Police Department","Sagar R");
			caseTwelve.getCaseInfo();
			/*caseTwelve.caseId = 12;
			caseTwelve.caseType = "Criminal Case";
			caseTwelve.caseTitle = "State vs Sagar";
			caseTwelve.courtName = "Sessions Court";
			caseTwelve.filingDate = "09/12/2022";
			caseTwelve.plaintiffName = "Police Department";
			caseTwelve.defendantName = "Sagar R";
			caseTwelve.getCaseInfo();*/
			
			CourtCase caseThirteen= new CourtCase(13,"Cheque Bounce","Nithin vs Shilpa","Magistrate Court","03/10/2023","Nithin V","Shilpa S");
			caseThirteen.getCaseInfo();
			/*caseThirteen.caseId = 13;
			caseThirteen.caseType = "Cheque Bounce";
			caseThirteen.caseTitle = "Nithin vs Shilpa";
			caseThirteen.courtName = "Magistrate Court";
			caseThirteen.filingDate = "03/10/2023";
			caseThirteen.plaintiffName = "Nithin V";
			caseThirteen.defendantName = "Shilpa S";
			caseThirteen.getCaseInfo();	*/
			
			CourtCase caseFourteen= new CourtCase(14,"Environmental Case","NGO vs Factory X","Green Tribunal","20/05/2024","Green Future NGO","Factory X Pvt Ltd");
			caseFourteen.getCaseInfo();
			/*caseFourteen.caseId = 14;
			caseFourteen.caseType = "Environmental Case";
			caseFourteen.caseTitle = "NGO vs Factory X";
			caseFourteen.courtName = "Green Tribunal";
			caseFourteen.filingDate = "20/05/2024";
			caseFourteen.plaintiffName = "Green Future NGO";
			caseFourteen.defendantName = "Factory X Pvt Ltd";
			caseFourteen.getCaseInfo();*/
			
			CourtCase caseFifteen= new CourtCase(15,"Consumer Case","Rohit vs OnlineStore","Consumer Court","14/02/2022","Rohit G","QuickShop Ltd");
			caseFifteen.getCaseInfo();
			/*caseFifteen.caseId = 15;
			caseFifteen.caseType = "Consumer Case";
			caseFifteen.caseTitle = "Rohit vs OnlineStore";
			caseFifteen.courtName = "Consumer Court";
			caseFifteen.filingDate = "14/02/2022";
			caseFifteen.plaintiffName = "Rohit G";
			caseFifteen.defendantName = "QuickShop Ltd";
			caseFifteen.getCaseInfo();*/
			
			CourtCase caseSixteen= new CourtCase(16,"Land Dispute","Villagers vs Builder","District Court","21/07/2023","Rural Committee","Skyline Developers");
			caseSixteen.getCaseInfo();
			/*caseSixteen.caseId = 16;
			caseSixteen.caseType = "Land Dispute";
			caseSixteen.caseTitle = "Villagers vs Builder";
			caseSixteen.courtName = "District Court";
			caseSixteen.filingDate = "21/07/2023";
			caseSixteen.plaintiffName = "Rural Committee";
			caseSixteen.defendantName = "Skyline Developers";
			caseSixteen.getCaseInfo();*/
			
			CourtCase caseSeventeen= new CourtCase(17,"Murder Trial","State vs Devraj","High Court","18/12/2021","State Prosecutor","Devraj P");
			caseSeventeen.getCaseInfo();
			/*caseSeventeen.caseId = 17;
			caseSeventeen.caseType = "Murder Trial";
			caseSeventeen.caseTitle = "State vs Devraj";
			caseSeventeen.courtName = "High Court";
			caseSeventeen.filingDate = "18/12/2021";
			caseSeventeen.plaintiffName = "State Prosecutor";
			caseSeventeen.defendantName = "Devraj P";
			caseSeventeen.getCaseInfo();*/
			
			CourtCase caseEighteen= new CourtCase(18,"Inheritance Dispute","Kiran vs Family Members","Civil Court","04/03/2022","Kiran B","Siblings");
			caseEighteen.getCaseInfo();
			/*caseEighteen.caseId = 18;
			caseEighteen.caseType = "Inheritance Dispute";
			caseEighteen.caseTitle = "Kiran vs Family Members";
			caseEighteen.courtName = "Civil Court";
			caseEighteen.filingDate = "04/03/2022";
			caseEighteen.plaintiffName = "Kiran B";
			caseEighteen.defendantName = "Siblings";
			caseEighteen.getCaseInfo();*/
			
			CourtCase caseNineteen= new CourtCase(19,"Trademark Violation","BrandX vs CopyCo","IPR Court","07/09/2023","BrandX Ltd","CopyCo Pvt Ltd");
			caseNineteen.getCaseInfo();
			/*caseNineteen.caseId = 19;
			caseNineteen.caseType = "Trademark Violation";
			caseNineteen.caseTitle = "BrandX vs CopyCo";
			caseNineteen.courtName = "IPR Court";
			caseNineteen.filingDate = "07/09/2023";
			caseNineteen.plaintiffName = "BrandX Ltd";
			caseNineteen.defendantName = "CopyCo Pvt Ltd";
			caseNineteen.getCaseInfo();*/
			
			CourtCase caseTwenty= new CourtCase(20,"Service Dispute","Employee A vs Company B","Labour Court","25/06/2024","Employee A", "Company B Pvt Ltd");
			caseTwenty.getCaseInfo();
			/*caseTwenty.caseId = 20;
			caseTwenty.caseType = "Service Dispute";
			caseTwenty.caseTitle = "Employee A vs Company B";
			caseTwenty.courtName = "Labour Court";
			caseTwenty.filingDate = "25/06/2024";
			caseTwenty.plaintiffName = "Employee A";
			caseTwenty.defendantName = "Company B Pvt Ltd";
			caseTwenty.getCaseInfo();*/
		System.out.println("main ended");
	}

}