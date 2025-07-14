class Market{
	static String typeOfProductsSold="Clothes";
	static boolean isWholeSale=true;
	static String location="Chickpete";
	static String timings="9:00 AM to 9:00 PM";
	static boolean isOpenOnSunday=false;
	static boolean isMetroAvailable=true;
	
	public static String getTypeOfProductsSold(){
		return typeOfProductsSold;
	}
	
	public static boolean getIsWholeSale(){
		return isWholeSale;
	}
	
	public static String getLocation(){
		return location;
	}
	
	public static String getTimings(){
		return timings;
	}
	
	public static boolean getIsOpenOnSunday(){
		return isOpenOnSunday;
	}
	
	public static boolean getIsMetroAvailable(){
		return isMetroAvailable;
	}
}