class Casino{

	int casinoId;
	String casinoName;
	String location;
	int establishedYear;
	int numberOfTablesGames;
	int numberOfSlotMachines;
	
	Casino(){
			System.out.println();
			System.out.println("Casino constructor without parameters loaded");
	}
	
	Casino(int casinoId,String casinoName){
			System.out.println();
			System.out.println("Casino constructor with(int,String) parameters loaded");
			this.casinoId=casinoId;
			this.casinoName=casinoName;
	}
	
	Casino(String location,int establishedYear){
			System.out.println();
			System.out.println("Casino constructor with(String,int) parameters loaded");
			this.location=location;
			this.establishedYear=establishedYear;
	}
	
	Casino(int numberOfTablesGames,int numberOfSlotMachines){
			System.out.println();
			System.out.println("Casino constructor with(int,int) parameters loaded");
			this.numberOfTablesGames=numberOfTablesGames;
			this.numberOfSlotMachines=numberOfSlotMachines;
	}
	
	Casino(int casinoId,String casinoName,String location,int establishedYear,int numberOfTablesGames,int numberOfSlotMachines){
			System.out.println();
			System.out.println("Casino constructor with parameters loaded");
			this.casinoId=casinoId;
			this.casinoName=casinoName;
			this.location=location;
			this.establishedYear=establishedYear;
			this.numberOfTablesGames=numberOfTablesGames;
			this.numberOfSlotMachines=numberOfSlotMachines;
	}
	
	public void getCasinoInfo(){
		System.out.println("casino  details:");
		System.out.println("id of casino is : "+casinoId);
		System.out.println("name of casino is : "+casinoName);
		System.out.println("casino is located at : "+location);
		System.out.println("establishedYear of the casino is : "+establishedYear);
		System.out.println("number of table games : "+numberOfTablesGames);
		System.out.println("number of slot machines :"+numberOfSlotMachines);
		
	}
}