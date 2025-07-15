class InstagramRunner{

	public static void main(String[] instagram){
		long contactNumber=7892622184l;
		String password="Prs@123";
		Instagram.logIn(contactNumber,password);
		System.out.println();
		String emailId="pavithraprakash@gmail.com";
		password="Prs@123";
		Instagram.logIn(emailId,password);
	}

}