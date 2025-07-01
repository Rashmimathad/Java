class Tourism{
	/*static String mysuru="Mysuru Palace";
	static String tajMahal="Taj Mahal";
	static String ooty="Ooty";
	static String charminar="Charminar";
	static String kedarnath="Kedarnath";
	static String puriJagannadh="Puri Jagannadh Temple";
	static String badrinath="Badrinath";
	static String aihole="Aihole";
	static String badami="Badami";
	static String pattadakallu="Pattadakallu";
	static String hampi="Hampi";
	static String anjanadri="Anjanadri Betta";
	static String madikeri="Madikeri";
	static String udupi="Udupi Shri Krishna Temple";
	static String murudeshwara="Murudeshwara";*/
	public static void main(String tourism[]){
			System.out.println("main started");
			String mysuru="Mysuru Palace";
			String tajMahal="Taj Mahal";
			String ooty="Ooty";
			String charminar="Charminar";
			String kedarnath="Kedarnath";
			String puriJagannadh="Puri Jagannadh Temple";
			String badrinath="Badrinath";
			String aihole="Aihole";
			String badami="Badami";
			String pattadakallu="Pattadakallu";
			String hampi="Hampi";
			String anjanadri="Anjanadri Betta";
			String madikeri="Madikeri";
			String udupi="Udupi Shri Krishna Temple";
			String murudeshwara="Murudeshwara";
			
		String touristPlaces[]={"Mysuru Palace","Taj Mahal","Ooty","Charminar","Kedarnath","Puri Jagannath Temple","Badrinath","Aihole","Badami","Pattadakallu","Hampi","Anjanadri Betta","Madikeri","Udupi sree krishna temple","Murudeshwara"};
		System.out.println("The tourist places for the tourism in India are : ");
		//System.out.println(touristPlaces[0]+","+touristPlaces[1]+","+touristPlaces[2]+","+touristPlaces[3]+","+touristPlaces[4]+","+touristPlaces[5]+","+touristPlaces[6]+","+touristPlaces[7]+","+touristPlaces[8]+","+touristPlaces[9]+","+touristPlaces[10]+","+touristPlaces[11]+","+touristPlaces[12]+","+touristPlaces[13]+","+touristPlaces[14]);
		for(String touristPlace : touristPlaces){
			System.out.println(touristPlace);
		}
				System.out.println("main ended");
	}
}