class GamingPc{

	static String processorType="Multi-core Processor";
	static int videoRam=8;
	static String graphicsCard="Nvidia's GeForce RTX 4060";
	static double processorFrequency=3.2;
	static int displaySize=19;
	static boolean hasMicrophoneJack=true;
	
	public static String getProcessorType(){
		return processorType;
	}
	
	public static int getVideoRam(){
		return videoRam;
	}
	
	public static String getGraphicsCard(){
		return graphicsCard;
	}
	
	public static double getProcessorFrequency(){
		return processorFrequency;
	}
	
	public static int getDisplaySize(){
		return displaySize;
	}
	
	public static boolean getHasMicrophoneJack(){
		return hasMicrophoneJack;
	}

}