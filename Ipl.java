class Ipl{
	/*static String csk="CSK";
	static String rcb="RCB";
	static String mi="MI";
	static String srh="SRH";
	static String pkbs="PKBS";
	static String kkr="KKR";
	static String gt="GT";
	static String lsg="LSG";
	static String dc="DC";
	static String rr="RR";*/
	//static String iplTeamNames[]={csk,rcb,mi,srh,pkbs,kkr,gt,lsg,dc,rr};
	public static void main(String ipl[]){
		System.out.println("main started");
		String csk="CSK";
		String rcb="RCB";
		String mi="MI";
		String srh="SRH";
		String pkbs="PKBS";
		String kkr="KKR";
		String gt="GT";
		String lsg="LSG";
		String dc="DC";
		String rr="RR";
		
		String iplTeamNames[]={csk,rcb,mi,srh,pkbs,kkr,gt,lsg,dc,rr};
		System.out.println("The IPL team names are : ");
		//System.out.println(iplTeamNames[0]+","+iplTeamNames[1]+","+iplTeamNames[2]+","+iplTeamNames[3]+","+iplTeamNames[4]+","+iplTeamNames[5]+","+iplTeamNames[6]+","+iplTeamNames[7]+","+iplTeamNames[8]+","+iplTeamNames[9]);
		for(String iplTeamName : iplTeamNames){
			System.out.println(iplTeamName);
		}
		System.out.println("main ended");
	}
}