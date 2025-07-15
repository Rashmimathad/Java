class SnapChatRunner{
	public static void main(String[] snap){
		
		String emailId="rashmimathad@gmail.com";
		String password="Rash@123";
		SnapChat.logIn(emailId,password);
		System.out.println();
		long phoneNumber=9019184800l;
		password="Rash@123";
		SnapChat.logIn(phoneNumber,password);
	}
}