class Contacts{
	String contactName;
	long phoneNumber;
	
	Contacts(){
		
	}
	
	Contacts(String contactName,long phoneNumber){
		this.contactName=contactName;
		this.phoneNumber=phoneNumber;
	}
	
	public void getContactDetails(){
		System.out.println("Contact details fetched...");
		System.out.println("contact name : "+contactName);
		System.out.println("Phone number : "+phoneNumber);
	}
}