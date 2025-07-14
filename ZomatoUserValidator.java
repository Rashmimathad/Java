class ZomatoUserValidator{

	static String givenName;
	static String surName;
	static String emailId;
	static int otpNumber;
	static int confirmOtpNumber;
	
	public static boolean validateZomatoUser(String gName,String sName, String email, int otp,int cOtp){
		boolean isUserValidated=false;
		boolean givenNameValid=false;
		boolean surNameValid=false;
		boolean emailIdValid=false;
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
		
		if(email!=null){
			emailId=email;
			emailIdValid=true;
		}else System.out.println("provide the valid emailId");
		
		if(otp!=0){
			otpNumber=otp;
			otpNumberValid=true;
		}else System.out.println("provide valid otp");
		
		if(cOtp!=0&&otp==cOtp){
			confirmOtpNumber=cOtp;
			confirmOtpNumberValid=true;
		}else System.out.println("provide valid confirm otp number");
		
		if(givenNameValid&&surNameValid&&emailIdValid&&otpNumberValid&&confirmOtpNumberValid){
		System.out.println("All the details provided are valid");
		isUserValidated=true;
		}
	
		return isUserValidated;
	}
	
}