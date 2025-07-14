class BlinkIt{

	static String givenName;
	static String surName;
	static long phoneNumber;
	static int otpNumber;
	static int confirmOtpNumber;
	
	public static boolean registerUser(String gName,String sName, long phNo, int otp,int cOtp){
		boolean isUserRegistered=false;
		boolean givenNameValid=false;
		boolean surNameValid=false;
		boolean phoneNumberValid=false;
		boolean otpNumberValid=false;
		boolean confirmOtpNumberValid=false;
		
		if(gName!=null){
			givenName=gName;
			givenNameValid=true;
		}else System.out.println("provide the valid name");
		
		if(sName!=null){
			surName=sName;
			surNameValid=true;
		}else System.out.println("provide the valid surname");
		
		if(phNo!=0){
			phoneNumber=phNo;
			phoneNumberValid=true;
		}else System.out.println("provide the valid phoneNumber");
		
		if(otp!=0){
			otpNumber=otp;
			otpNumberValid=true;
		}else System.out.println("provide valid otp");
		
		if(cOtp!=0&&otp==cOtp){
			confirmOtpNumber=cOtp;
			confirmOtpNumberValid=true;
		}else System.out.println("provide valid confirm otp number");
		
		if(givenNameValid&&surNameValid&&phoneNumberValid&&otpNumberValid&&confirmOtpNumberValid){
		System.out.println("All the details provided are valid");
		isUserRegistered=true;
		}
		
		return isUserRegistered;
	
	}
	
	public static void getUserInfo(){
		System.out.println();
		System.out.println("The given name of the user is : "+givenName);
		System.out.println("The sur name of the user is : "+surName);
		System.out.println("The phone number of the user is : "+phoneNumber);
		System.out.println("The OTP of the user is : "+otpNumber);
		System.out.println("The confirm OTP of the user is : "+confirmOtpNumber);
	
	}




}