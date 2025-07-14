class Radio{

	static String batteryLife="21 to 25 hours";
	static int weightInGrams= 690;
	static double customerRating=4.7;
	static boolean isWaterProof=false;
	static int voltageLevel=120;
	static String radioType="AM/FM";
	
	public static String getBatteryLife(){
		return batteryLife;
	}
	
	public static int getWeight(){
		return weightInGrams;
	}
	
	public static double getCustomerRating(){
		return customerRating;
	}
	
	public static boolean getIsWaterProof(){
		return isWaterProof;
	}
	
	public static int getVoltageLevel(){
		return voltageLevel;
	}
	
	public static String getRadioType(){
		return radioType; 
	}


}