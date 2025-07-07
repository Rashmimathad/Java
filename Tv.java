class Tv{
	
	static int currentVolume;
	static int maxVolume=5;
	static boolean  isConnected;
	
	public static void onOrOff(){
		System.out.println();
		System.out.println("on or off method started");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The TV  is on");
		}
		else if(isConnected==true){
			isConnected=false;	
			System.out.println("The TV is off");
		}
				System.out.println("on or off method ended");
			System.out.println();
		return ;
	
	}
	
	public static void increaseVolume(){
		
				System.out.println();
			System.out.println("increase volume method started");
		if(isConnected==true){
			  if(currentVolume<maxVolume){
			  currentVolume=currentVolume+1;
			  System.out.println("The current volume is : "+currentVolume);
			  }
		 else System.out.println("max volume reached");

		}
		 else System.out.println("TV on madu..");
	System.out.println("increase volume method ended");
			System.out.println();
	return;
	}

	public static void decreaseVolume(){
				System.out.println();
			System.out.println("decrease volume  method started");
		if(isConnected==true){
			  if(currentVolume>0){
			  currentVolume=currentVolume-1;
			  System.out.println("The current volume is : "+currentVolume);
			  }
		 else System.out.println("min volume reached");
		}
		 else System.out.println("TV on madu..");
		System.out.println("decrease volume method ended");
				System.out.println();
		return;
	}
}