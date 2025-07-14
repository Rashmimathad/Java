class GamingPcRunner{
	public static void main(String[] gaming){
		System.out.println("main started");
		String processorType=GamingPc.getProcessorType();
		System.out.println("The processor type of the gaming PC is "+processorType);
		int videoRam=GamingPc.getVideoRam();
		System.out.println("The video ram of the gaming PC is "+videoRam+" GB");
		String graphicsCard=GamingPc.getGraphicsCard();
		System.out.println("The graphics card of the gaming PC is "+graphicsCard);
		double processorFrequency=GamingPc.getProcessorFrequency();
		System.out.println("The processor frequency of the gaming PC is "+processorFrequency+" Hz");
		int displaySize=GamingPc.getDisplaySize();
		System.out.println("Display size of the gaming PC is "+displaySize+" inch");
		boolean hasMicrophoneJack=GamingPc.getHasMicrophoneJack();
		System.out.println("does the gaming PC has microphone jack? "+hasMicrophoneJack);
		System.out.println("main ended");
	}

}