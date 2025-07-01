class PlayStore{
	/*static String templeRun="Temple Run";
	static String canva="Canva";
	static String netflix="Netflix";
	static String linkedin="LinkedIn";
	static String mxPlayer="Mx Player";
	static String blinkIt="Blink It";
	static String zomato="Zomato";
	static String uber="Uber";
	static String rapido="Rapido";
	static String youTube="Youtube";*/
	public static void main(String playstore[]){
			System.out.println("main started");
			String templeRun="Temple Run";
			String canva="Canva";
			String netflix="Netflix";
			String linkedin="LinkedIn";
			String mxPlayer="Mx Player";
			String blinkIt="Blink It";
			String zomato="Zomato";
			String uber="Uber";
			String rapido="Rapido";
			String youTube="Youtube";
			
		String apps[]={templeRun,canva,netflix,linkedin,mxPlayer,blinkIt,zomato,uber,rapido,youTube};
		System.out.println("The apps on the play store are : ");
		//System.out.println(apps[0]+","+apps[1]+","+apps[2]+","+apps[3]+","+apps[4]+","+apps[5]+","+apps[6]+","+apps[7]+","+apps[8]+","+apps[9]);
		for(String app : apps){
			System.out.println(app);
		}
				System.out.println("main ended");
	}
}