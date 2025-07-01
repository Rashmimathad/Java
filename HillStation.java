class HillStation{
	/*static String taj="Taj Hotels";
	static String heritage="Welcome Heritage Hotels";
	static String clubMahindra="Club Mahindra";
	static String luxury="Luxury Resorts";
	static String hill="Hill Resorts";
	static String jungle="Jungle Resorts";
	static String dewDrops="Dew Drops Resort";*/
	public static void main(String hillstation[]){
			System.out.println("main started");
			String taj="Taj Hotels";
			String heritage="Welcome Heritage Hotels";
			String clubMahindra="Club Mahindra";
			String luxury="Luxury Resorts";
			String hill="Hill Resorts";
			String jungle="Jungle Resorts";
			String dewDrops="Dew Drops Resort";
			
		String resorts[]={taj,heritage,clubMahindra,luxury,hill,jungle,dewDrops};
		System.out.println("The resorts in the hill station are : ");
		//System.out.println(resorts[0]+","+resorts[1]+","+resorts[2]+","+resorts[3]+","+resorts[4]+","+resorts[5]+","+resorts[6]);
		for(String resort : resorts){
			System.out.println(resort);
		}
				System.out.println("main ended");
	}
}