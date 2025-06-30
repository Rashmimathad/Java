class Earth{
	public static void main(String earth[]){
		String continents[]={"Asia","Africa","North America","South America","Australia","Europe","Antarctica"};
		System.out.println();
		System.out.println("The continents on the earth are : ");
		//System.out.println(continents[0]+","+continents[1]+","+continents[2]+","+continents[3]+","+continents[4]+","+continents[5]+","+continents[6]);
		for(String continent : continents){
			System.out.println(continent);
		}
	}
}