class YonoSbiRunner{
	
	public static void main(String[] sbi){
		System.out.println();
		boolean userIsRegistered = YonoSbi.registerUser(774589863214l,"Rashmi","Mathad","wJaz","wJaz");
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) YonoSbi.getUserInfo();
	
	}


}