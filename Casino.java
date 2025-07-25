class Casino{

	int casinoId;
	String casinoName;
	String location;
	int establishedYear;
	int numberOfTablesGames;
	int numberOfSlotMachines;
	
	public void getCasinoInfo(){
		System.out.println();
		System.out.println("casino one details:");
		System.out.println("id of casino is : "+casinoId);
		System.out.println("name of casino is : "+casinoName);
		System.out.println("casino is located at : "+location);
		System.out.println("establishedYear of the casino is : "+establishedYear);
		System.out.println("number of table games : "+numberOfTablesGames);
		System.out.println("number of slot machines :"+numberOfSlotMachines);
		
	}
}