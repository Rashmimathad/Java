class Earth{
	/*static String asia="Asia";
	static String africa="Africa";
	static String northAmerica="North America";
	static String southAmerica="South America";
	static String australia="Australia";
	static String europe="Europe";
	static String antarctica="Antarctica";*/
	public static void main(String earth[]){
			System.out.println("main started");
			 String asia="Asia";
			String africa="Africa";
			String northAmerica="North America";
			String southAmerica="South America";
			String australia="Australia";
			String europe="Europe";
			String antarctica="Antarctica";
			
		String continents[]={asia,africa,northAmerica,southAmerica,australia,europe,antarctica};
		System.out.println("The continents on the earth are : ");
		//System.out.println(continents[0]+","+continents[1]+","+continents[2]+","+continents[3]+","+continents[4]+","+continents[5]+","+continents[6]);
		for(String continent : continents){
			System.out.println(continent);
		}
				System.out.println("main ended");
	}
}