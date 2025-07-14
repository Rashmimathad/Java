class FlipkartUserValidator{
	
	static String givenName;
	static String surName;
	static long phoneNumber;
	static String password;
	static String confirmPassword;

	public static boolean validateFlipkartUser(String gName,String sName, long phNo, String pwd,String cPwd){
	
		boolean isUserValidated=false;
		boolean givenNameValid=false;
		boolean surNameValid=false;
		boolean phoneNumberValid=false;
		boolean passwordValid=false;
		boolean confirmPasswordValid=false;
		
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
		
		if(pwd!=null){
			password=pwd;
			passwordValid=true;
		}else System.out.println("provide valid password");
		
		if(cPwd!=null&&pwd==cPwd){
			confirmPassword=cPwd;
			confirmPasswordValid=true;
		}else System.out.println("provide valid confirm password");
		
		if(givenNameValid&&surNameValid&&phoneNumberValid&&passwordValid&&confirmPasswordValid){
		System.out.println("All the details provided are valid");
		isUserValidated=true;
		}
		
	 return isUserValidated;
	 
	}

}