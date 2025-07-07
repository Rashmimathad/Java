class Mixer{

//onOrOff 

	static boolean isPluggedOnOrOff;
	static int currentSpeed;
	static int maxSpeed=3;

	public static void onOrOff(){
		System.out.println();
		System.out.println("On or off method started");
			if(isPluggedOnOrOff==false){
				isPluggedOnOrOff=true;
				System.out.println("The mixer is turned on");
			}
			else{
				isPluggedOnOrOff=false;
				System.out.println("The mixer is turned off");
			}
		System.out.println("on or off method ended");
		return;
	}
//increaseSpeed 
	public static void increaseSpeed(){
		System.out.println();
		System.out.println("increase speed method started");
			if(isPluggedOnOrOff==true){
				if(currentSpeed<maxSpeed){
					currentSpeed=currentSpeed+1;
					System.out.println("The current speed of the mixer is : "+currentSpeed);
				}
				else System.out.println("The maximum speed is reached");
			}
			else System.out.println("Turn on the mixer");
		System.out.println("increase speed method ended");
		return;
	}
	//decreaseSpeed
	public static void decreaseSpeed(){
		System.out.println();
		System.out.println("decrease speed method started");
			if(isPluggedOnOrOff==true){
				if(currentSpeed>0){
					currentSpeed=currentSpeed-1;
					System.out.println("The current speed of the mixer is : "+currentSpeed);
				}
				else System.out.println("The minimum speed is reached");
			}
			else System.out.println("Turn  on the mixer");
		System.out.println("decrease speed method ended");
		return;
	}


}