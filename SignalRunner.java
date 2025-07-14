class SignalRunner{
	public static void main(String[] signal){
		System.out.println("main started");
		int noOfCctvCameras=Signal.getNoOfCctvCameras();
		System.out.println("The no of cctv cameras at the traffic signal are "+noOfCctvCameras);
		boolean isOperational=Signal.getIsOperational();
		System.out.println("Is the signal operational? "+isOperational);
		String locatedAt=Signal.getLocation();
		System.out.println("The signal is located at "+locatedAt);
		int noOfSignalPoles=Signal.getNoOfSignalPoles();
		System.out.println("The ni of signal poles are "+noOfSignalPoles);
		boolean isZebraCrossingAvailable=Signal.getIsZebraCrossingAvailable();
		System.out.println("Is zebra crossing available at the signal? "+isZebraCrossingAvailable);
		int noOfTrafficPolice=Signal.getNoOfTrafficPolice();
		System.out.println("The no of traffic police officers at signal are "+noOfTrafficPolice);
		System.out.println("main ended")
	}

}