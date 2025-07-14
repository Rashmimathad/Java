class UidaiRunner{

	public static void main(String[] uidai){
		System.out.println();
		boolean userIsRegistered = Uidai.registerUser("Rashmi Mathad",748597451845l,7859612435l,2197,2197);
		System.out.println("is  user Registered? " + userIsRegistered );
		if(userIsRegistered) Uidai.getUserInfo();
	
	}


}