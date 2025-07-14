class Instagram{
	
	static String emailId;
	static String firstName;
	static String lastName;
	static String password;
	static String confirmPassword;
	
	public static boolean registerUser(String email,String fName,String lName,String pwd,String cPwd){
		boolean isUserRegistered=false;
		boolean userValidated=InstagramUserValidator.validateInstagramUser(email,fName,lName,pwd,cPwd);
		if(userValidated) isUserRegistered=true;
		return isUserRegistered;
	
	}
	
	public static void getUserInfo(){
		
		firstName=InstagramUserValidator.firstName;
		lastName=InstagramUserValidator.lastName;
		emailId=InstagramUserValidator.emailId;
		password=InstagramUserValidator.password;
		confirmPassword=InstagramUserValidator.confirmPassword;
		System.out.println();
		System.out.println("The first name of the user is : "+firstName);
		System.out.println("The last name of the user is : "+lastName);
		System.out.println("The email id of the user is : "+emailId);
		System.out.println("The password of the user is : "+password);
		System.out.println("The confirm password of the user is : "+confirmPassword);
	
	}
}