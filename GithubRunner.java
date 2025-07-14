class GithubRunner{

	public static void main(String[] github){
		System.out.println();
		boolean userIsRegistered = Github.registerUser("rashmimathad@gmail.com","Rashmi","Mathad","Rash@1111","Rash@1111");
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) Github.getUserInfo();
	
	}

}