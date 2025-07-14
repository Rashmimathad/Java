class ZeptoRunner{
	public static void main(String[] zepto){
		System.out.println();
		boolean userIsRegistered = Zepto.registerUser("Rashmi","Mathad",7485962145l,8795,8795);
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) Zepto.getUserInfo();
	
	}
}