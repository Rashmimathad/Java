class UidaiUserValidator{

	static String fullName;
	static long aadharNumber;
	static long phoneNumber;
	static int otpNumber;
	static int confirmOtpNumber;
	
	public static boolean validateUidaiUser(String fName,long aNumber,long phNo,int otp,int cOtp){
		boolean isUserValidated=false;
		boolean fullNameValid=false;
		boolean aadharNumberValid=false;
		boolean phoneNumberValid=false;
		boolean otpNumberValid=false;
		boolean confirmOtpNumberValid=false;
	
		if(fName!=null){
			fullName=fName;
			fullNameValid=true;
		}else System.out.println("provide the valid full name");
		
		if(aNumber!=0){
			aadharNumber=aNumber;
			aadharNumberValid=true;
		}else System.out.println("provide valid aadhar number");
		
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
		
		if(fullNameValid&&aadharNumberValid&&phoneNumberValid&&otpNumberValid&&confirmOtpNumberValid){
		System.out.println("All the details provided are valid");
		isUserValidated=true;
		}
		
		return isUserValidated;
	}
	
}