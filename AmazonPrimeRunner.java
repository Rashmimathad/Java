class AmazonPrimeRunner{

	public static void main(String[] prime){
		System.out.println();
		boolean userIsRegistered = AmazonPrime.registerUser("rashmimathad@gmail.com","Rashmi","Mathad","Rash@123","Rash@123");
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) AmazonPrime.getUserInfo();
	
	}
}