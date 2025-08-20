class MobileRunner{
	public static void main(String mobile[]){
		System.out.println("main started");
		System.out.println();
			Contacts contact = new Contacts("Inchara",8431101915l);
			PhoneBook phoneBook=new PhoneBook(117,contact);
			Mobile mobileOne=new Mobile("Galaxy F34 5G",30,phoneBook);
			mobileOne.getMobileDetails();
		System.out.println();
		System.out.println("main ended");
	}

}