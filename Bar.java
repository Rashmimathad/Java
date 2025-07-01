class Bar {
	/*static String vodka = "Vodka";
	static String gin = "Gin";
	static String tequila="Tequila";
	static String rum="Rum";
	static String whisky="Whisky";
	static String brandy="Brandy";
	static String wine="Wine";
	static String beer="Beer";
	static String fortifiedWine="Fortified Wine";
	static String scotch="Scotch";
	static String cider="Cider";
	static String singani="Singani";*/
	public static void main(String bar[]){
		System.out.println("main started");
		String vodka = "Vodka";
		String gin = "Gin";
		String tequila="Tequila";
		String rum="Rum";
		String whisky="Whisky";
		String brandy="Brandy";
		String wine="Wine";
		String beer="Beer";
		String fortifiedWine="Fortified Wine";
		String scotch="Scotch";
		String cider="Cider";
		String singani="Singani";
		
		String alcoholNames[]={vodka,gin,tequila,rum,whisky,brandy,wine,beer,fortifiedWine,scotch,cider,singani};
		System.out.println("The alcohol names in the bar are : ");
		//System.out.println(alcoholNames[0]+","+alcoholNames[1]+","+alcoholNames[2]+","+alcoholNames[3]+","+alcoholNames[4]+","+alcoholNames[5]+","+alcoholNames[6]+","+alcoholNames[7]+","+alcoholNames[8]+","+alcoholNames[9]+","+alcoholNames[10]+","+alcoholNames[11]);
		for(String alcoholName : alcoholNames){
			System.out.println(alcoholName);
		}
		System.out.println("main ended");
	}
}