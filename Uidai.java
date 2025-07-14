class Uidai{
	
	static String fullName;
	static long aadharNumber;
	static long phoneNumber;
	static int otpNumber;
	static int confirmOtpNumber;
	
	public static boolean registerUser(String fName,long aNumber,long phNo,int otp,int cOtp){
		boolean isUserRegistered=false;
		boolean userValidated=UidaiUserValidator.validateUidaiUser(fName,aNumber,phNo,otp,cOtp);
		if(userValidated) isUserRegistered=true;
		return isUserRegistered;
	
	}
	
	public static void getUserInfo(){
		fullName=UidaiUserValidator.fullName;
		aadharNumber=UidaiUserValidator.aadharNumber;
		phoneNumber=UidaiUserValidator.phoneNumber;
		otpNumber=UidaiUserValidator.otpNumber;
		confirmOtpNumber=UidaiUserValidator.confirmOtpNumber;
		System.out.println();
		System.out.println("The full name of the user is : "+fullName);
		System.out.println("The aadhar number of the user is : "+aadharNumber);
		System.out.println("The phone number of the user is : "+phoneNumber);
		System.out.println("The OTP of the user is : "+otpNumber);
		System.out.println("The confirm OTP of the user is : "+confirmOtpNumber);
	
	}

}