class Signal{

	static int noOfCctvCameras=5;
	static boolean isOperational = true;
	static String locatedAt="Bshyam Cicle";
	static int noOfSignalPoles=3;
	static boolean isZebraCrossingAvailable=true;
	static int noOfTrafficPolice=7;
	
	public static int getNoOfCctvCameras(){
		return noOfCctvCameras;
	}
	
	public static boolean getIsOperational(){
		return isOperational;
	}
	
	public static String getLocation(){
		return locatedAt;
	}
	
	public static int getNoOfSignalPoles(){
		return noOfSignalPoles;
	}
	
	public static boolean getIsZebraCrossingAvailable(){
		return isZebraCrossingAvailable;
	}
	
	public static int getNoOfTrafficPolice(){
		return noOfTrafficPolice;
	}

}