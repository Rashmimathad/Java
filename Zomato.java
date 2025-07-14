class Zomato{
	
	static String givenName;
	static String surName;
	static String emailId;
	static int otpNumber;
	static int confirmOtpNumber;
	
	public static boolean registerUser(String gName,String sName, String email, int otp,int cOtp){
		boolean isUserRegistered=false;
		boolean userValidated=ZomatoUserValidator.validateZomatoUser(gName,sName,email,otp,cOtp);
		if(userValidated) isUserRegistered=true;
		return isUserRegistered;
	
	}
	
	public static void getUserInfo(){
		givenName=ZomatoUserValidator.givenName;
		surName=ZomatoUserValidator.surName;
		emailId=ZomatoUserValidator.emailId;
		otpNumber=ZomatoUserValidator.otpNumber;
		confirmOtpNumber=ZomatoUserValidator.confirmOtpNumber;
		System.out.println();
		System.out.println("The given name of the user is : "+givenName);
		System.out.println("The sur name of the user is : "+surName);
		System.out.println("The emailId of the user is : "+emailId);
		System.out.println("The OTP of the user is : "+otpNumber);
		System.out.println("The confirm OTP of the user is : "+confirmOtpNumber);
	
	}
}