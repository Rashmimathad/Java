class FacebookRunner{
	public static void main(String[] fb){
		System.out.println();
		boolean userIsRegistered = Facebook.registerUser("rashmimathad@gmail.com","Rashmi","Mathad","Rash@1234","Rash@1234");
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) Facebook.getUserInfo();
	
	}
}