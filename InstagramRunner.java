class InstagramRunner{

	public static void main(String[] insta){
		System.out.println();
		boolean userIsRegistered = Instagram.registerUser("rashmimathad@gmail.com","Rashmi","Mathad","Rash@123","Rash@123");
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) Instagram.getUserInfo();
	
	}

}