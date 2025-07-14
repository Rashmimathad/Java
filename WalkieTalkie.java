class WalkieTalkie{
	static boolean isPortable=true;
	static String range="2 to 5 Km";
	static boolean isTracable=true;
	static int frequency=136;
	static String batteryLife="12 to 24 hours";
	static int noOfChannels=16;
	
	public static boolean getIsPortable(){
		return isPortable;
	}
	
	public static String getRange(){
		return range;
	}
	
	public static boolean getIsTracable(){
		return isTracable;
	}
	
	public static int getFrequency(){
		return frequency;
	}
	
	public static String getBatteryLife(){
		return batteryLife;
	}
	
	public static int getNoOfChannels(){
		return noOfChannels;
	}
}