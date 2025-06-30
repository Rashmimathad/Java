class Ipl{
	static String iplTeamNames[]={"CSK","SRH","MI","RCB","PKBS","KKR","GT","LSG","DC","RR"};
	public static void main(String ipl[]){
		System.out.println();
		System.out.println("The IPL team names are : ");
		//System.out.println(iplTeamNames[0]+","+iplTeamNames[1]+","+iplTeamNames[2]+","+iplTeamNames[3]+","+iplTeamNames[4]+","+iplTeamNames[5]+","+iplTeamNames[6]+","+iplTeamNames[7]+","+iplTeamNames[8]+","+iplTeamNames[9]);
		for(String iplTeamName : iplTeamNames){
			System.out.println(iplTeamName);
		}
	}
}