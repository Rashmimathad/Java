class Flipkart{
	
	static String givenName;
	static String surName;
	static long phoneNumber;
	static String password;
	static String confirmPassword;
	
	public static boolean registerUser(String gName,String sName, long phNo, String pwd,String cPwd){
		boolean isUserRegistered=false;
		boolean userValidated=FlipkartUserValidator.validateFlipkartUser(gName,sName,phNo,pwd,cPwd);
		if(userValidated) isUserRegistered=true;
		return isUserRegistered;
	
	}
	
	public static void getUserInfo(){
		givenName=FlipkartUserValidator.givenName;
		surName=FlipkartUserValidator.surName;
		phoneNumber=FlipkartUserValidator.phoneNumber;
		password=FlipkartUserValidator.password;
		confirmPassword=FlipkartUserValidator.confirmPassword;
		System.out.println();
		System.out.println("The given name of the user is : "+givenName);
		System.out.println("The sur name of the user is : "+surName);
		System.out.println("The phone number of the user is : "+phoneNumber);
		System.out.println("The password of the user is : "+password);
		System.out.println("The confirm password of the user is : "+confirmPassword);
	
	}
}