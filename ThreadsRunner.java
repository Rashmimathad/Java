class ThreadsRunner{
	public static void main(String[] threads){
		long contactNumber=7892622184l;
		String password="Prs@123";
		Threads.logIn(contactNumber,password);
		System.out.println();
		String userName="rashmi_mathad";
		password="Prs@123";
		Threads.logIn(userName,password);
	}
}