class JuiceShop{
	/*static String aamPanna="Aam Panna";
	static String mango="Mango";
	static String orange="Orange";
	static String waterMelon="Watermelon";
	static String muskMelon="MuskMelon";
	static String apple="Apple";
	static String avocado="Avocado";
	static String cranberry="Cranberry";
	static String dragonFruit="Dragon Fruit";
	static String grape ="Grape";
	static String guava="Guava";
	static String lime="Lime";
	static String lychee="Lychee";
	static String pomeGranate="Pomegranate";
	static String pineApple="Pineapple";*/
	public static void main(String juice[]){
			System.out.println("main started");
			String aamPanna="Aam Panna";
			String mango="Mango";
			String orange="Orange";
			String waterMelon="Watermelon";
			String muskMelon="MuskMelon";
			String apple="Apple";
			String avocado="Avocado";
			String cranberry="Cranberry";
			String dragonFruit="Dragon Fruit";
			String grape ="Grape";
			String guava="Guava";
			String lime="Lime";
			String lychee="Lychee";
			String pomeGranate="Pomegranate";
			String pineApple="Pineapple";
			
		String  juices[]={"Aam Panna","Mango","Orange","Watermelon","MuskMelon","Apple","Avocado","Cranberry","Dragon fruit","Grape","Guava","Lime","Lychee","Pomegranate","Pineapple"};
		System.out.println("The juices of the juice shop are : ");
		//System.out.println(juices[0]+","+juices[1]+","+juices[2]+","+juices[3]+","+juices[4]+","+juices[5]+","+juices[6]+","+juices[7]+","+juices[8]+","+juices[9]+","+juices[10]+","+juices[11]+","+juices[12]+","+juices[13]+","+juices[14]);
		for(String juiceName : juices){
			System.out.println(juiceName);
		}
				System.out.println("main ended");
	}
}