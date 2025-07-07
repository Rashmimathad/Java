class WashingMachine{
	static boolean isSwitchedOn;
	static int currentSpeed;
	static int maxSpeed=5;
	
	public static void onOrOff(){
	
		System.out.println();
		System.out.println("on or off method started");
		if(isSwitchedOn==false){
			isSwitchedOn=true;
			System.out.println("The washing machine is  switched on");
		}
		else {
			isSwitchedOn=false;
			System.out.println("The washing machine is switched off");
		}
		System.out.println("on or off method ended");
		return;
	}

	public static void increaseSpeed(){
		System.out.println();
		System.out.println("increase speed method started");
		if(isSwitchedOn==true){
			if(currentSpeed<maxSpeed){
				currentSpeed=currentSpeed+1;
				System.out.println("The current speed  is : "+currentSpeed);
			}
			else System.out.println("The maximum Speed limit reached");
		}
		else System.out.println("Switch on the washing machine");
		System.out.println("increase speed method ended");
		return;
	}
	
	public static void decreaseSpeed(){
		System.out.println();
		System.out.println("decrease speed method started");
		if(isSwitchedOn==true){
			if(currentSpeed>0){
				currentSpeed=currentSpeed-1;
				System.out.println("The current speed  is : "+currentSpeed);
			}
			else System.out.println("minimum speed limit reached");
		}
		else System.out.println("Switch on the WashingMachine");
		System.out.println("decrease speed method ended");
		return;
	}

}