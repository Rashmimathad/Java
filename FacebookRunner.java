class FacebookRunner{
	public static void main(String[] fb){
		
		String emailId="rashmimathad@gmail.com";
		String password="Rash@123";
		Facebook.logIn(emailId,password);
		System.out.println();
		long phoneNumber=9019184800l;
		password="Rash@123";
		Facebook.logIn(phoneNumber,password);
	}
}