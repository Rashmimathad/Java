class PlayStation{
	/*static String grandTheft="Grand Theft Auto V";
	static String godOfWar="God of War";
	static String lastOfUs="The Last of Us Part II";
	static String ghostTsushima="Ghost of Tsushima: Legends";
	static String watchDogs="Watch Dogs";
	static String bundleTony="Game BundleTony Hawk's";
	static String mortalKombat="Mortal Kombat 11";
	static String starWars="Star Wars";
	static String fortNite="Fortnite";
	static String freeFire="Garena Free Fire";*/
	public static void main(String playstation[]){
			System.out.println("main started");
			String grandTheft="Grand Theft Auto V";
			String godOfWar="God of War";
			String lastOfUs="The Last of Us Part II";
			String ghostTsushima="Ghost of Tsushima: Legends";
			String watchDogs="Watch Dogs";
			String bundleTony="Game BundleTony Hawk's";
			String mortalKombat="Mortal Kombat 11";
			String starWars="Star Wars";
			String fortNite="Fortnite";
			String freeFire="Garena Free Fire";
			
		String games[]={grandTheft,godOfWar,lastOfUs,ghostTsushima,watchDogs,bundleTony,mortalKombat,starWars,fortNite,freeFire};
		System.out.println("The games of the play station are : ");
		//System.out.println(games[0]+","+games[1]+","+games[2]+","+games[3]+","+games[4]+","+games[5]+","+games[6]+","+games[7]+","+games[8]+","+games[9]);
		for(String game : games){
			System.out.println(game);
		}
				System.out.println("main ended");
	}
}