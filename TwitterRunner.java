class TwitterRunner{
	public static void main(String[] fb){
		
		String userName="rashh__7";
		String password="Rash@123";
		Twitter.logIn(userName,password);
		System.out.println();
		long phoneNumber=9019184800l;
		password="Rash@123";
		Twitter.logIn(phoneNumber,password);
	}
}