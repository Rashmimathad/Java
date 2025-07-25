class King{
	int kingId;
	String kingName;
	String dynastyName;
	String kingdomName;
	String capitalCity;
	String reignStart;
	String reignEnd;
	
	public void getKingInfo(){
		System.out.println();
		System.out.println("King  details : ");
		System.out.println("id of the king : "+kingId);
		System.out.println("name of the king is : "+kingName);
		System.out.println("name of the dynasty of the king : "+dynastyName);
		System.out.println("name of the kingdom : "+kingdomName);
		System.out.println("capitalCity of the kingdom is : "+capitalCity);
		System.out.println("reign starte of the kingdom is : "+reignStart);
		System.out.println("reign end of the kingdom is : "+reignEnd);
	}
}