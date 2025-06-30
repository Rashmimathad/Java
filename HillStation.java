class HillStation{
	public static void main(String hillstation[]){
		String resorts[]={"Taj Hotels","WelcomHeritage Hotels","Club Mahindra","Luxury Resorts","Hill Resorts","Jungle Lodges","Dew Drops"};
		System.out.println();
		System.out.println("The resorts in the hill station are : ");
		//System.out.println(resorts[0]+","+resorts[1]+","+resorts[2]+","+resorts[3]+","+resorts[4]+","+resorts[5]+","+resorts[6]);
		for(String resort : resorts){
			System.out.println(resort);
		}
	}
}