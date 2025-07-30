class CasinoRunner{
	public static void main(String casino[]){
		System.out.println("main started");
		System.out.println();
			Casino casinoOne = new Casino(1,"Casino Royale");
			System.out.println("id of casino is : "+casinoOne.casinoId);
			System.out.println("name of casino is : "+casinoOne.casinoName);
			System.out.println();
			
			Casino casinoTwo = new Casino("Macau",2000);
			System.out.println("casino is located at : "+casinoTwo.location);
			System.out.println("establishedYear of the casino is : "+casinoTwo.establishedYear);
			System.out.println();
			
			Casino casinoThree = new Casino(80,1200);
			System.out.println("number of table games : "+casinoThree.numberOfTablesGames);
			System.out.println("number of slot machines :"+casinoThree.numberOfSlotMachines);
			System.out.println();
			
			Casino casinoFour = new Casino();
			casinoFour.getCasinoInfo();
			Casino casinoFive = new Casino(5,"Desert Treasure","Dubai",2015,45,1100);
			casinoFive.getCasinoInfo();
		System.out.println();
		System.out.println("main ended");
	}
}