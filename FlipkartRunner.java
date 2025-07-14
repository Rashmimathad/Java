class FlipkartRunner{

	public static void main(String[] flipkart){
		System.out.println();
		boolean userIsRegistered = Flipkart.registerUser("Rashmi","Mathad",9784568495l,"Rash@123","Rash@123");
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) Flipkart.getUserInfo();
	}

}