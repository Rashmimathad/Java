class Uidai{
	static String fullName;
	static long aadharNumber;
	static long phoneNumber;
	static int otpNumber;
	static int confirmOtpNumber;
	
	public static boolean registerUser(String fName,long aNumber,long phNo,int otp,int cOtp){
		boolean isUserRegistered=false;
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
		isUserRegistered=true;
		}
		
		return isUserRegistered;
	
	}
	
	public static void getUserInfo(){
		System.out.println();
		System.out.println("The full name of the user is : "+fullName);
		System.out.println("The aadhar number of the user is : "+aadharNumber);
		System.out.println("The phone number of the user is : "+phoneNumber);
		System.out.println("The OTP of the user is : "+otpNumber);
		System.out.println("The confirm OTP of the user is : "+confirmOtpNumber);
	
	}

}