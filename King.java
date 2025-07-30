class King{
	int kingId;
	String kingName;
	String dynastyName;
	String kingdomName;
	String capitalCity;
	String reignStart;
	String reignEnd;
	
	King(){
		System.out.println();
		System.out.println("King constructor without parameters loaded");
	}
	
	King(int kingId,String kingName){
		System.out.println();
		System.out.println("King constructor with(int,String) parameters loaded");
		this.kingId=kingId;
		this.kingName=kingName;
	}
	
	King(String dynastyName,String kingdomName,String capitalCity){
		System.out.println();
		System.out.println("King constructor with(String,String,String) parameters loaded");
		this.dynastyName=dynastyName;
		this.kingdomName=kingdomName;
		this.capitalCity=capitalCity;
	}
	
	King(String reignStart,String reignEnd){
		System.out.println();
		System.out.println("King constructor with(String,String) parameters loaded");
		this.reignStart=reignStart;
		this.reignEnd=reignEnd;
	}
	
	King(int kingId,String kingName,String dynastyName,String kingdomName,String capitalCity,String reignStart,String reignEnd){
		System.out.println();
		System.out.println("King constructor with parameters loaded");
		this.kingId=kingId;
		this.kingName=kingName;
		this.dynastyName=dynastyName;
		this.kingdomName=kingdomName;
		this.capitalCity=capitalCity;
		this.reignStart=reignStart;
		this.reignEnd=reignEnd;
	}
	
	public void getKingInfo(){
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