class YonoSbi{

	static long accountNumber;
	static String firstName;
	static String lastName;
	static String captchaText;
	static String confirmCaptchaText;
	
	public static boolean registerUser(long accNumber,String fName,String lName,String captcha,String confirmCaptcha){
	
		boolean isUserRegistered=false;
		boolean firstNameValid=false;
		boolean lastNameValid=false;
		boolean captchaTextValid=false;
		boolean confirmCaptchaTextValid=false;
		boolean accountNumberValid=false;
		
		if(accNumber!=0){
			accountNumber=accNumber;
			accountNumberValid=true;
		}else System.out.println("provide valid account number");
		
		if(fName!=null){
			firstName=fName;
			firstNameValid=true;
		}else System.out.println("provide valid first name");
	
		if(lName!=null){
			lastName=lName;
			lastNameValid=true;
		}else System.out.println("provide valid last name");
		
		if(captcha!=null){
			captchaText=captcha;
			captchaTextValid=true;
		}else System.out.println("provide valid captcha text");
		
		if(confirmCaptcha!=null){
			confirmCaptchaText=confirmCaptcha;
			confirmCaptchaTextValid=true;
		}else System.out.println("provide valid confirm captcha text");
		
		if(accountNumberValid && firstNameValid && lastNameValid && captchaTextValid && confirmCaptchaTextValid){
			System.out.println("All details provided are valid");
			isUserRegistered=true;
		}	
		return isUserRegistered;
	}
	
	public static void getUserInfo(){
		System.out.println("The first name of the user is "+firstName);
		System.out.println("The last name of the user is "+lastName);
		System.out.println("The account number of the user is "+accountNumber);
		System.out.println("The captcha is "+captchaText);
		System.out.println("The confirm captcha is "+confirmCaptchaText);
	
	}
}