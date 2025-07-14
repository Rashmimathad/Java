class BlinkIt{

	static String givenName;
	static String surName;
	static long phoneNumber;
	static int otpNumber;
	static int confirmOtpNumber;
	
	public static boolean registerUser(String gName,String sName, long phNo, int otp,int cOtp){
		boolean isUserRegistered=false;
		boolean userValidated=BlinkItUserValidator.validateBlinkItUser(gName,sName,phNo,otp,cOtp);
		if(userValidated) isUserRegistered=true;
		return isUserRegistered;
	
	}
	
	public static void getUserInfo(){
		
		givenName=BlinkItUserValidator.givenName;
		surName=BlinkItUserValidator.surName;
		phoneNumber=BlinkItUserValidator.phoneNumber;
		otpNumber=BlinkItUserValidator.otpNumber;
		confirmOtpNumber=BlinkItUserValidator.confirmOtpNumber;
		
		System.out.println();
		System.out.println("The given name of the user is : "+givenName);
		System.out.println("The sur name of the user is : "+surName);
		System.out.println("The phone number of the user is : "+phoneNumber);
		System.out.println("The OTP of the user is : "+otpNumber);
		System.out.println("The confirm OTP of the user is : "+confirmOtpNumber);
	
	}

}