class Instagram{
	
	static String emailId;
	static String firstName;
	static String lastName;
	static String password;
	static String confirmPassword;
	
	public static boolean registerUser(String email,String fName,String lName,String pwd,String cPwd){
		boolean isUserRegistered=false;
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
		isUserRegistered=true;
		}else System.out.println("provide valid password");
		
		return isUserRegistered;
	
	}
	
	public static void getUserInfo(){
		System.out.println();
		System.out.println("The first name of the user is : "+firstName);
		System.out.println("The last name of the user is : "+lastName);
		System.out.println("The email id of the user is : "+emailId);
		System.out.println("The password of the user is : "+password);
		System.out.println("The confirm password of the user is : "+confirmPassword);
	
	}
}