class WalkieTalkieRunner{
	public static void main(String[] walkietalkie){
		System.out.println("main started");
		boolean isPortable=WalkieTalkie.getIsPortable();
		System.out.println("IS WalkieTalkie portable? "+isPortable);
		String range=WalkieTalkie.getRange();
		System.out.println("Range of walkie talkie is from "+range);
		boolean isTracable=WalkieTalkie.getIsTracable();
		System.out.println("Is walkie talkie tracable? "+isTracable);
		int frequency=WalkieTalkie.getFrequency();
		System.out.println("frequency of walkie talkie is : "+frequency+" Hz");
		String batteryLife=WalkieTalkie.getBatteryLife();
		System.out.println("The battery life of walkie talkie is from "+batteryLife);
		int noOfChannels=WalkieTalkie.getNoOfChannels();
		System.out.println("No of channnels in walkie talkie is "+noOfChannels);
		System.out.println("main ended");
	}

}