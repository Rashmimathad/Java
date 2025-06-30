class Tourism{
	public static void main(String tourism[]){
		String touristPlaces[]={"Mysuru Palace","Taj Mahal","Ooty","Charminar","Kedarnath","Puri Jagannath Temple","Badrinath","Aihole","Badami","Pattadakallu","Hampi","Anjanadri Betta","Madikeri","Udupi sree krishna temple","Murudeshwara"};
		System.out.println();
		System.out.println("The tourist places for the tourism in India are : ");
		//System.out.println(touristPlaces[0]+","+touristPlaces[1]+","+touristPlaces[2]+","+touristPlaces[3]+","+touristPlaces[4]+","+touristPlaces[5]+","+touristPlaces[6]+","+touristPlaces[7]+","+touristPlaces[8]+","+touristPlaces[9]+","+touristPlaces[10]+","+touristPlaces[11]+","+touristPlaces[12]+","+touristPlaces[13]+","+touristPlaces[14]);
		for(String touristPlace : touristPlaces){
			System.out.println(touristPlace);
		}
	}
}