class KingRunner{
	public static void main(String king[]){
		System.out.println("main started");
		System.out.println();	
			King kingOne = new King(1,"Krishnaraja Vadeyar");
			System.out.println("id of the king : "+kingOne.kingId);
			System.out.println("name of the king is : "+kingOne.kingName);
			System.out.println();	
			
			King kingTwo = new King("Maurya","Maurya Empire","Pataliputra");
			System.out.println("name of the dynasty of the king : "+kingTwo.dynastyName);
			System.out.println("name of the kingdom : "+kingTwo.kingdomName);
			System.out.println("capitalCity of the kingdom is : "+kingTwo.capitalCity);
			System.out.println();
			
			King kingThree = new King("268 BCE","232 BCE");
			System.out.println("reign starte of the kingdom is : "+kingThree.reignStart);
			System.out.println("reign end of the kingdom is : "+kingThree.reignEnd);
			System.out.println();
			
			King kingFour = new King();
			kingFour.getKingInfo();
			System.out.println();
			
			King kingFive = new King(5,"Raja Raja Chola I","Chola","Chola Dynasty","Thanjavur","985 CE","1014 CE");
			kingFive.getKingInfo();
		System.out.println();
		System.out.println("main ended");
	}

}