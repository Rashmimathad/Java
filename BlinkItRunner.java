class BlinkItRunner{
	public static void main(String[] blinkit){
		System.out.println();
		boolean userIsRegistered = BlinkIt.registerUser("Rashmi","Mathad",9485671298l,9971,9971);
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) BlinkIt.getUserInfo();
	
	}
}