class ZomatoRunner{
	
	public static void main(String[] zomato){
		System.out.println();
		boolean userIsRegistered = Zomato.registerUser("Rashmi","Mathad","rashmimathad@gmail.com",7595,7595);
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) Zomato.getUserInfo();
	
	}

}