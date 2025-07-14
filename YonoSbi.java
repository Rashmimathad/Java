class YonoSbi{

	static long accountNumber;
	static String firstName;
	static String lastName;
	static String captchaText;
	static String confirmCaptchaText;
	
	public static boolean registerUser(long accNumber,String fName,String lName,String captcha,String confirmCaptcha){
	
		boolean isUserRegistered=false;
		boolean userValidated=YonoSbiUserValidator.validateYonoSbiUser(accNumber,fName,lName,captcha,confirmCaptcha);
		if(userValidated) isUserRegistered=true;
		return isUserRegistered;
	}
	
	public static void getUserInfo(){
		firstName=YonoSbiUserValidator.firstName;
		lastName=YonoSbiUserValidator.lastName;
		accountNumber=YonoSbiUserValidator.accountNumber;
		captchaText=YonoSbiUserValidator.captchaText;
		confirmCaptchaText=YonoSbiUserValidator.confirmCaptchaText;
		System.out.println();
		System.out.println("The first name of the user is "+firstName);
		System.out.println("The last name of the user is "+lastName);
		System.out.println("The account number of the user is "+accountNumber);
		System.out.println("The captcha is "+captchaText);
		System.out.println("The confirm captcha is "+confirmCaptchaText);
	
	}
}