class AirConditioner{

	//onOrOff
	static boolean isSwitchedOn;
	static int currentTemperature;
	static int maxTemperature=10;
	
	public static void onOrOff(){
	
		System.out.println();
		System.out.println("on or off method started");
		if(isSwitchedOn==false){
			isSwitchedOn=true;
			System.out.println("The AC is switched on");
		}
		else {
			isSwitchedOn=false;
			System.out.println("The AC is switched off");
		}
		System.out.println("on or off method ended");
		return;
	}
//	increaseTemperature
	public static void increaseTemperature(){
		System.out.println();
		System.out.println("increase temperature method started");
		if(isSwitchedOn==true){
			if(currentTemperature<maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("The current temperature of the AC is : "+currentTemperature);
			}
			else System.out.println("The maximum temperature limit reached");
		}
		else System.out.println("Switch on the AC");
		System.out.println("increase temperature method ended");
		return;
	}
//decreaseTemperature
	public static void decreaseTemperature(){
		System.out.println();
		System.out.println("decrease temperature method started");
		if(isSwitchedOn==true){
			if(currentTemperature>0){
				currentTemperature=currentTemperature-1;
				System.out.println("The current temperature of the AC is : "+currentTemperature);
			}
			else System.out.println("Switch on the AC");
		}
		else System.out.println("Switch on the AC");
		System.out.println("decrease temperature method ended");
		return;
	}

}