class InstagramUserValidator{

	static String emailId;
	static String firstName;
	static String lastName;
	static String password;
	static String confirmPassword;
	
	public static boolean validateInstagramUser(String email,String fName,String lName,String pwd,String cPwd){
		boolean isUserValidated=false;
		boolean emailIdValid=false;
		boolean firstNameValid=false;
		boolean lastNameValid=false;
		boolean passwordValid=false;
		boolean confirmPasswordValid=false;
		
		if(email!=null){
			emailId=email;
			emailIdValid=true;
		}else System.out.println("provide valid email id");
		
		if(fName!=null){
			firstName=fName;
			firstNameValid=true;
		}else System.out.println("provide valid first name");
		
		if(lName!=null){
			lastName=lName;
			lastNameValid=true;
		}else System.out.println("provide valid last name");
		
		if(pwd!=null){
			password=pwd;
			passwordValid=true;
		}
		
			if(cPwd!=null&&pwd==cPwd){
			confirmPassword=cPwd;
			confirmPasswordValid=true;
		}else System.out.println("provide valid confirm password");
		
		if(firstNameValid&&lastNameValid&&emailIdValid&&passwordValid&&confirmPasswordValid){
		System.out.println("All the details provided are valid");
		isUserValidated=true;
		}else System.out.println("provide valid password");
		
		return isUserValidated;
	}


}