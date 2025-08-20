class PhoneBook{
	int noOfContacts;
	Contacts contacts;
	
	PhoneBook(){
		 
	}
	 
	PhoneBook(int noOfContacts,Contacts contacts){
		this.noOfContacts=noOfContacts;
		this.contacts=contacts;
	}
	
	public void getPhoneBookDetails(){
		System.out.println("PhoneBook details fetched...");
		System.out.println("No of contacts : "+noOfContacts);
		System.out.println();
		System.out.println("Contact details : ");
		this.contacts.getContactDetails();
	}
}