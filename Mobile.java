class Mobile{
	String mobileName;
	int noOfApps;
	PhoneBook phoneBook;
	
	Mobile(){
		
	}
	
	Mobile(String mobileName,int noOfApps,PhoneBook phoneBook){
		System.out.println("Mobile constructor with parameters invoked");
		this.mobileName=mobileName;
		this.noOfApps=noOfApps;
		this.phoneBook=phoneBook;
	}
	
	public void getMobileDetails(){
		System.out.println("Mobile details fetched....");
		System.out.println("Name of the mobile is : "+mobileName);
		System.out.println("NO of apps in the mobile are : "+noOfApps);
		System.out.println();
		System.out.println("PhoneBook Details :");
			this.phoneBook.getPhoneBookDetails();
	}
}